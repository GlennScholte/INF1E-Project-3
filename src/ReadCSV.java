import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {

        ReadCSV obj = new ReadCSV();
        obj.run();

    }

    public void run() {

        String csvFile = "resources/fietstrommels.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        int rcentrum = 0;
        int charlois = 0;
        int delfshaven = 0;
        int feijenoord = 0;
        int hschiebroek = 0;
        int hoekvanholland = 0;
        int hoogvliet = 0;
        int ijsselmonde = 0;
        int kcrooswijk = 0;
        int noord = 0;
        int overschie = 0;
        int pernis = 0;
        int palexander = 0;
        int rozenburg = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] bikebox = line.split(cvsSplitBy);

                if (bikebox[7].equals("Centrum"))
                    rcentrum += 1;
                if (bikebox[7].equals("Charlois"))
                    charlois += 1;
                if (bikebox[7].equals("Delfshaven"))
                    delfshaven += 1;
                if (bikebox[7].equals("Feijenoord"))
                    feijenoord += 1;
                if (bikebox[7].equals("Hillegersberg"))
                    hschiebroek += 1;
                if (bikebox[7].equals("Hoek van Holland")) // Staat niet in lijst
                    hoekvanholland += 1;
                if (bikebox[7].equals("Hoogvliet"))
                    hoogvliet += 1;
                if (bikebox[7].equals("IJsselmonde"))
                    ijsselmonde += 1;
                if (bikebox[7].equals("Kralingen/Crooswijk"))
                    kcrooswijk += 1;
                if (bikebox[7].equals("Noord"))
                    noord += 1;
                if (bikebox[7].equals("Overschie"))
                    overschie += 1;
                if (bikebox[7].equals("Pernis"))
                    pernis += 1;
                if (bikebox[7].equals("Prins Alexander")) // Staat niet in lijst
                    palexander += 1;
                if (bikebox[7].equals("Rozenburg")) // Staat niet in lijst
                    rozenburg += 1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(rcentrum);
        System.out.println(charlois);
        System.out.println(delfshaven);
        System.out.println(feijenoord);
        System.out.println(hschiebroek);
        System.out.println(hoekvanholland);
        System.out.println(hoogvliet);
        System.out.println(ijsselmonde);
        System.out.println(kcrooswijk);
        System.out.println(noord);
        System.out.println(overschie);
        System.out.println(pernis);
        System.out.println(palexander);
        System.out.println(rozenburg);
    }

}