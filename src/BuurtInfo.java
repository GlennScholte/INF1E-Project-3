import java.util.ArrayList;
import java.util.List;

public class BuurtInfo {
    private String naam;
    private int aantalDiefstal;
    private int aantalFietsboxen;

    static BuurtInfo RotterdamCentrum =         new BuurtInfo("Rotterdam Centrum", 18, 18);
    static BuurtInfo Charlois =                 new BuurtInfo("Charlois", 15, 14);
    static BuurtInfo Delfshaven =               new BuurtInfo("Delfshaven", 11, 10);
    static BuurtInfo Feijenoord =               new BuurtInfo("Feijenoord", 12, 13);
    static BuurtInfo HillegersbergSchiebroek =  new BuurtInfo("Hillegersberg / Schiebroek", 10, 12);
    static BuurtInfo HoekVanHolland =           new BuurtInfo("Hoek van Holland", 11, 10);
    static BuurtInfo Hoogvliet =                new BuurtInfo("Hoogvliet", 20, 14);
    static BuurtInfo IJsselmonde =              new BuurtInfo("IJsselmonde", 19, 10);
    static BuurtInfo KralingenCrooswijk =       new BuurtInfo("Kralingen / Crooswijk", 14, 18);
    static BuurtInfo Noord =                    new BuurtInfo("Noord", 10, 14);
    static BuurtInfo Overschie =                new BuurtInfo("Overschie", 15, 17);
    static BuurtInfo Pernis =                   new BuurtInfo("Pernis", 11, 9);
    static BuurtInfo PrinsAlexander =           new BuurtInfo("Prins Alexander", 17, 12);
    static BuurtInfo Rozenburg =                new BuurtInfo("Rozenburg", 13, 13);

    public BuurtInfo(String naam, int aantalDiefstal, int aantalFietsboxen){
        this.naam = naam;
        this.aantalDiefstal = aantalDiefstal;
        this.aantalFietsboxen= aantalFietsboxen;
    }

    public int getAantalFietsboxen() {
        return aantalFietsboxen;
    }

    public void setAantalFietsboxen(int aantalFietsboxen) {
        this.aantalFietsboxen = aantalFietsboxen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalDiefstal() {
        return aantalDiefstal;
    }

    public void setAantalDiefstal(int aantalDiefstal) {
        this.aantalDiefstal = aantalDiefstal;
    }
}
