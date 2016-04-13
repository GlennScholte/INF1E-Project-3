import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

public class CirkelDiagramDiefstal {

    public static void display(){
        Stage window = new Stage();
        Scene scene = new Scene(new Group(), 700, 700);
        window.setTitle("");
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                    new PieChart.Data(BuurtInfo.RotterdamCentrum.getNaam()          , BuurtInfo.RotterdamCentrum.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Charlois.getNaam()                  , BuurtInfo.Charlois.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Pernis.getNaam()                    , BuurtInfo.Pernis.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Delfshaven.getNaam()                , BuurtInfo.Delfshaven.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Feijenoord.getNaam()                , BuurtInfo.Feijenoord.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.HillegersbergSchiebroek.getNaam()   , BuurtInfo.HillegersbergSchiebroek.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.HoekVanHolland.getNaam()            , BuurtInfo.HoekVanHolland.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Hoogvliet.getNaam()                 , BuurtInfo.Hoogvliet.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.IJsselmonde.getNaam()               , BuurtInfo.IJsselmonde.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.KralingenCrooswijk.getNaam()        , BuurtInfo.KralingenCrooswijk.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Noord.getNaam()                     , BuurtInfo.Noord.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Overschie.getNaam()                 , BuurtInfo.Overschie.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.PrinsAlexander.getNaam()            , BuurtInfo.PrinsAlexander.getAantalFietsboxen()),
                    new PieChart.Data(BuurtInfo.Rozenburg.getNaam()                 , BuurtInfo.Rozenburg.getAantalFietsboxen())
            );


        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Imported Fruits");
        chart.setTranslateY(150);
        chart.setTranslateX(100);
        scene.getStylesheets().add("StylesheetCirkelDiagram.css");
        ((Group) scene.getRoot()).getChildren().add(chart);
            window.setScene(scene);
            window.show();
    }
}
