package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Diefstal {

    public static int getNumber(String SQL) {
        int res = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Fietsdief", "postgres", "rainbowbrony1");
            Statement stmnt = con.createStatement();
            ResultSet rs = stmnt.executeQuery(SQL);
            while (rs.next()) {
                res = Integer.parseInt(rs.getString("count"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        return res;
    }

    public static int getCentrum() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('12 COOL', '19 DIJKZIGT', '11 OUDE WESTEN', '10 STADSDRIEHOEK', '13 CS-KWARTIER')");

    }

    public static int getCharlois() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('72 CARNISSE', '93 HEIJPLAAT', '74 OUD-CHARLOIS', '77 PENDRECHT', '71 TARWEWIJK', '75 WIELEWAAL', '73 ZUIDWIJK', '76 ZUIDPLEIN')");
    }

    public static int getDelfshaven() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('21 BOSPOLDER', '22 TUSSENDIJKEN', '20 DELFSHAVEN', '29 SCHIEMOND', '25 MIDDELLAND', '24 NIEUWE WESTEN', '23 SPANGEN', '28 WITTE DORP', '27 OUD MATHENESSE')");
    }

    public static int getFeijenoord() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('86 AFRIKAANDERWIJK', '81 BLOEMHOF', '87 FEIJENOORD', '82 HILLESLUIS', '85 KATENDRECHT', '88 NOORDEREILAND', '80 VREEWIJK', '17 FEIJENOORD-KOP VAN ZUID')");
    }

    public static int getHilSchie() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('61 HILLEGERSBERG-ZUID', '62 HILLEGERSBERG-NOORD', '65 MOLENLAANKWARTIER', '60 SCHIEBROEK', '64 TERBREGGE')");
    }

    public static int getHoekvHolland() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('__ HOEK VAN HOLLAND', '__ OUDE HOEK')");
    }

    public static int getHoogvliet() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('43 OUDELAND')");
    }

    public static int getIjsselmonde() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('90 BEVERWAARD', '84 LOMBARDIJEN', '89 GROOT IJSSELMONDE')");
    }

    public static int getKralCroos() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('36 NIEUW CROOSWIJK', '37 OUD CROOSWIJK', '45 DE ESCH', '41 KRALINGEN-WEST', '42 KRALINGEN-OOST', '14 RUBROEK', '47 STRUISENBURG')");
    }

    public static int getNoord() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('15 AGNIESEBUURT', '31 BERGPOLDER', '32 BLIJDORP', '34 LISKWARTIER', '35 OUDE NOORDEN', '16 PROVENIERSWIJK')");
    }

    public static int getOverschie() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('51 KLEINPOLDER', '57 LANDZICHT', '56 OVERSCHIE', '55 ZESTIENHOVEN')");
    }

    public static int getPernis() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('91 PERNIS')");
    }

    public static int getPrinsalex() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('49 HET LAGE LAND', '46 KRALINGSEVEER', '68 NESSELANDE', '63 OMMOORD', '67 OOSTERFLANK', '48 PRINSENLAND', '66 ZEVENKAMP')");
    }

    public static int getRozenburg() {
        return getNumber("select count(buurt)\n" +
                "from fietsdiefstallen\n" +
                "where buurt in ('04 ROZENBURG')");
    }
}
