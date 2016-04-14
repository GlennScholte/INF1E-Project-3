package Database;
import static Database.Diefstal.getNumber;

public class Fietstrommel {

    public static int getCentrum() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Centrum'");

    }

    public static int getCharlois() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Charlois'");
    }

    public static int getDelfshaven() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Delfshaven'");
    }

    public static int getFeijenoord() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Feijenoord'");
    }

    public static int getHilSchie() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Schiebroek' or deelgemeente = 'Hillegersberg'");
    }

    public static int getHoekvHolland() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Hoek van Holland'");
    }

    public static int getHoogvliet() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Hoogvliet'");
    }

    public static int getIjsselmonde() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'IJsselmonde'");
    }

    public static int getKralCroos() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Kralingen/Crooswijk'");
    }

    public static int getNoord() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Noord'");
    }

    public static int getOverschie() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Overschie'");
    }

    public static int getPernis() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Pernis'");
    }

    public static int getPrinsalex() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Prins Alexander'");
    }

    public static int getRozenburg() {
        return getNumber("SELECT count(deelgemeente)\n" +
                "FROM fietstrommels\n" +
                "WHERE deelgemeente = 'Rozenburg'");
    }
}
