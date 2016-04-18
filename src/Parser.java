import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Parser {

    private static Connection con;
    private static Statement stmnt;

    public static void OpenDatabase() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dieffiets", "postgres", "rainbowbrony1");
            stmnt = con.createStatement();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private static void ParseFile(String path, String tablename) {
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                String values = "";
                for (String column : data) {
                    if (column.length() < 1){
                        values += "null" + ",";
                    } else {
                        column = column.replace("'", "''");
                        values += "'" + column + "'" + ",";
                    }
                }
                values = values.substring(0,values.length()-1);

                String sql = "INSERT INTO "+ tablename + " VALUES("
                        + values +
                        ");";
                System.out.println(sql);
                try {
                    stmnt.executeUpdate(sql);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void ParseTrommels(String path) {
        ParseFile(path, "fietstrommels");
    }

    public static void ParseDiefstallen(String path) {
        ParseFile(path, "fietsdiefstallen");
    }
}
