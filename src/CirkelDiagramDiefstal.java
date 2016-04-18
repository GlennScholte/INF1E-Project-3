//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//import javafx.scene.chart.*;
//import javafx.scene.Group;
//
//public class CirkelDiagramDiefstal {
//
//    public static void display(){
//        Stage window = new Stage();
//        Scene scene = new Scene(new Group(), 700, 700);
//        window.setTitle("");
//            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
//                    new PieChart.Data(BuurtInfo.Charlois.getNaam()                  , BuurtInfo.Charlois.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Pernis.getNaam()                    , BuurtInfo.Pernis.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Delfshaven.getNaam()                , BuurtInfo.Delfshaven.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Feijenoord.getNaam()                , BuurtInfo.Feijenoord.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.HillegersbergSchiebroek.getNaam()   , BuurtInfo.HillegersbergSchiebroek.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.KralingenCrooswijk.getNaam()        , BuurtInfo.KralingenCrooswijk.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.RotterdamCentrum.getNaam()          , BuurtInfo.RotterdamCentrum.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.HoekVanHolland.getNaam()            , BuurtInfo.HoekVanHolland.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Hoogvliet.getNaam()                 , BuurtInfo.Hoogvliet.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.IJsselmonde.getNaam()               , BuurtInfo.IJsselmonde.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Noord.getNaam()                     , BuurtInfo.Noord.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Overschie.getNaam()                 , BuurtInfo.Overschie.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.PrinsAlexander.getNaam()            , BuurtInfo.PrinsAlexander.getAantalDiefstal()),
//                    new PieChart.Data(BuurtInfo.Rozenburg.getNaam()                 , BuurtInfo.Rozenburg.getAantalDiefstal())
//            );
//
//        final PieChart chart = new PieChart(pieChartData);
//        chart.setTitle("Diefstal in de 14 buurten van Rotterdam");
//        chart.setTranslateY(150);
//        chart.setTranslateX(100);
//
//        final Label caption = new Label("");
//        caption.setTextFill(Color.WHITE);
//        caption.setStyle("-fx-font: 24 arial;");
//
//        for (final PieChart.Data data : chart.getData()) {
//            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
//                    new EventHandler<MouseEvent>() {
//                        @Override public void handle(MouseEvent e) {
//                            caption.setTranslateX(e.getSceneX());
//                            caption.setTranslateY(e.getSceneY());
//                            caption.setText(String.valueOf(data.getPieValue()));
//                            caption.setVisible(true);
//                        }
//                    });
//        }
//
//        ((Group) scene.getRoot()).getChildren().add(chart);
//        ((Group) scene.getRoot()).getChildren().add(caption);
//        scene.getStylesheets().add("stylesheets/StylesheetCirkelDiagram.css");
//        window.setScene(scene);
//            window.show();
//    }
//}
