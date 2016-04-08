import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Grafiek {
    final static String Centrum         = "Rotterdam Centrum";
    final static String Charlois        = "Charlois";
    final static String Delfshaven      = "Delfshaven";
    final static String Feijenoord      = "Feijenoord";
    final static String Hillegersberg   = "Hillegersberg";
    final static String HoekVanHolland  = "Hoek van Holland";
    final static String Hoogvliet       = "Hoogvliet";
    final static String IJselmonde      = "IJselmonde";
    final static String Noord           = "Noord";
    final static String Overschie       = "Overschie";
    final static String PrinsAlexander  = "Prins Alexander";

    public static void display(){

        Stage window = new Stage();
        window.setTitle("");

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Fietsdiefstal en Fietsboxen in Rotterdam");
        xAxis.setLabel("Buurt");
        yAxis.setLabel("Aantal");

        XYChart.Series diefstal = new XYChart.Series();
        diefstal.setName("Diefstal");
        diefstal.getData().add(new XYChart.Data(Centrum, 110));
        diefstal.getData().add(new XYChart.Data(Charlois, 251.34));
        diefstal.getData().add(new XYChart.Data(Delfshaven, 401.34));
//        diefstal.getData().add(new XYChart.Data(Feijenoord, 201.34));
//        diefstal.getData().add(new XYChart.Data(Hillegersberg, 241.34));
//        diefstal.getData().add(new XYChart.Data(HoekVanHolland, 251.34));
//        diefstal.getData().add(new XYChart.Data(Hoogvliet, 256.34));
//        diefstal.getData().add(new XYChart.Data(IJselmonde, 254));
//        diefstal.getData().add(new XYChart.Data(Noord, 144));
//        diefstal.getData().add(new XYChart.Data(Overschie, 175.34));
//        diefstal.getData().add(new XYChart.Data(PrinsAlexander, 231.34));

        XYChart.Series fietsboxen = new XYChart.Series();
        fietsboxen.setName("Fietsboxen");
        fietsboxen.getData().add(new XYChart.Data(Centrum, 321));
        fietsboxen.getData().add(new XYChart.Data(Charlois, 123));
        fietsboxen.getData().add(new XYChart.Data(Delfshaven, 122));
//        fietsboxen.getData().add(new XYChart.Data(Feijenoord, 125));
//        fietsboxen.getData().add(new XYChart.Data(Hillegersberg, 129));
//        fietsboxen.getData().add(new XYChart.Data(HoekVanHolland, 163));
//        fietsboxen.getData().add(new XYChart.Data(Hoogvliet, 265));
//        fietsboxen.getData().add(new XYChart.Data(IJselmonde, 264));
//        fietsboxen.getData().add(new XYChart.Data(Noord, 241));
//        fietsboxen.getData().add(new XYChart.Data(Overschie, 211));
//        fietsboxen.getData().add(new XYChart.Data(PrinsAlexander, 192));

        bc.getData().addAll(diefstal, fietsboxen);
        Scene scene = new Scene(bc, 1500, 1000);
        window.setScene(scene);
        window.show();
        }
    }


