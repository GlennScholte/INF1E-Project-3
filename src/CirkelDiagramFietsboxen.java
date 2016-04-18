import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CirkelDiagramFietsboxen {

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
        chart.setTitle("Aantal fietsboxen in de 14 buurten van Rotterdam");
        chart.setTranslateY(150);
        chart.setTranslateX(100);

        final Label caption = new Label("");
        caption.setTextFill(Color.WHITE);
        caption.setStyle("-fx-font: 24 arial;");

        for (final PieChart.Data data : chart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                    new EventHandler<MouseEvent>() {
                        @Override public void handle(MouseEvent e) {
                            caption.setTranslateX(e.getSceneX());
                            caption.setTranslateY(e.getSceneY());
                            caption.setText(String.valueOf(String.valueOf(data.getPieValue())));
                            caption.setVisible(true);

                        }
                    });
        }

        ((Group) scene.getRoot()).getChildren().add(chart);
        ((Group) scene.getRoot()).getChildren().add(caption);
        scene.getStylesheets().add("stylesheets/StylesheetCirkelDiagram.css");
        window.setScene(scene);
        window.show();
    }
}
