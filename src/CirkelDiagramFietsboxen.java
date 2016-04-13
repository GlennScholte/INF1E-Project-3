import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import javafx.scene.Group;

public class CirkelDiagramFietsboxen {

    public static void display(){
        Stage window = new Stage();
        Scene scene = new Scene(new Group(), 700, 700);
        window.setTitle("");
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data(BuurtInfo.RotterdamCentrum.getNaam()          , BuurtInfo.RotterdamCentrum.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Charlois.getNaam()                  , BuurtInfo.Charlois.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Pernis.getNaam()                    , BuurtInfo.Pernis.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Delfshaven.getNaam()                , BuurtInfo.Delfshaven.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Feijenoord.getNaam()                , BuurtInfo.Feijenoord.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.HillegersbergSchiebroek.getNaam()   , BuurtInfo.HillegersbergSchiebroek.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.HoekVanHolland.getNaam()            , BuurtInfo.HoekVanHolland.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Hoogvliet.getNaam()                 , BuurtInfo.Hoogvliet.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.IJsselmonde.getNaam()               , BuurtInfo.IJsselmonde.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.KralingenCrooswijk.getNaam()        , BuurtInfo.KralingenCrooswijk.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Noord.getNaam()                     , BuurtInfo.Noord.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Overschie.getNaam()                 , BuurtInfo.Overschie.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.PrinsAlexander.getNaam()            , BuurtInfo.PrinsAlexander.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Rozenburg.getNaam()                 , BuurtInfo.Rozenburg.getAantalDiefstal())
        );


        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Diefstal in de 14 buurten van Rotterdam");
        chart.setTranslateY(150);
        chart.setTranslateX(100);
        scene.getStylesheets().add("StylesheetCirkelDiagram.css");
        ((Group) scene.getRoot()).getChildren().add(chart);
        window.setScene(scene);
        window.show();
    }
}
