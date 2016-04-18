import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Database.Diefstal;
import Database.Fietstrommel;

public class BuurtInfo {
    private String naam;
    private int aantalDiefstal;
    private int aantalFietsboxen;

    static BuurtInfo RotterdamCentrum =         new BuurtInfo("Rotterdam Centrum", Diefstal.getCentrum()/10, Fietstrommel.getCentrum());
    static BuurtInfo Charlois =                 new BuurtInfo("Charlois", Diefstal.getCharlois()/10, Fietstrommel.getCharlois());
    static BuurtInfo Pernis =                   new BuurtInfo("Pernis", Diefstal.getPernis()/10, Fietstrommel.getPernis());
    static BuurtInfo Delfshaven =               new BuurtInfo("Delfshaven", Diefstal.getDelfshaven()/10, Fietstrommel.getDelfshaven());
    static BuurtInfo Feijenoord =               new BuurtInfo("Feijenoord", Diefstal.getFeijenoord()/10, Fietstrommel.getFeijenoord());
    static BuurtInfo HillegersbergSchiebroek =  new BuurtInfo("Hillegersberg / Schiebroek", Diefstal.getHilSchie()/10, Fietstrommel.getHilSchie());
    static BuurtInfo HoekVanHolland =           new BuurtInfo("Hoek van Holland", Diefstal.getHoekvHolland()/10, Fietstrommel.getHoekvHolland());
    static BuurtInfo Hoogvliet =                new BuurtInfo("Hoogvliet", Diefstal.getHoogvliet()/10, Fietstrommel.getHoogvliet());
    static BuurtInfo IJsselmonde =              new BuurtInfo("IJsselmonde", Diefstal.getIjsselmonde()/10, Fietstrommel.getIjsselmonde());
    static BuurtInfo KralingenCrooswijk =       new BuurtInfo("Kralingen / Crooswijk", Diefstal.getKralCroos()/10, Fietstrommel.getKralCroos());
    static BuurtInfo Noord =                    new BuurtInfo("Noord", Diefstal.getNoord()/10, Fietstrommel.getNoord());
    static BuurtInfo Overschie =                new BuurtInfo("Overschie", Diefstal.getOverschie()/10, Fietstrommel.getOverschie());
    static BuurtInfo PrinsAlexander =           new BuurtInfo("Prins Alexander", Diefstal.getPrinsalex()/10, Fietstrommel.getPrinsalex());
    static BuurtInfo Rozenburg =                new BuurtInfo("Rozenburg", Diefstal.getRozenburg()/10, Fietstrommel.getRozenburg());

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
