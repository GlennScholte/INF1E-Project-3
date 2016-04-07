import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Diefstal extends Application {
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
    final static String PrinsALexander  = "Prins Alexander";

    @Override public void start(Stage stage) {
        stage.setTitle("");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Fietsendiefstal en Fietstrommels in Rotterdam");
        xAxis.setLabel("Buurt");
        yAxis.setLabel("Aantal");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Diefstal");
        series1.getData().add(new XYChart.Data(Centrum, 88));
        series1.getData().add(new XYChart.Data(Charlois, 99));
        series1.getData().add(new XYChart.Data(Delfshaven, 948));
        series1.getData().add(new XYChart.Data(Feijenoord, 697));
        series1.getData().add(new XYChart.Data(Hillegersberg, 0));
        series1.getData().add(new XYChart.Data(HoekVanHolland, 0));
        series1.getData().add(new XYChart.Data(Hoogvliet, 0));
        series1.getData().add(new XYChart.Data(IJselmonde, 358));
        series1.getData().add(new XYChart.Data(Noord, 1259));
        series1.getData().add(new XYChart.Data(Overschie, 185));
        series1.getData().add(new XYChart.Data(PrinsALexander, 1395));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Fietstrommels");
        series2.getData().add(new XYChart.Data(Centrum, 253));
        series2.getData().add(new XYChart.Data(Charlois, 49));
        series2.getData().add(new XYChart.Data(Delfshaven, 448));
        series2.getData().add(new XYChart.Data(Feijenoord, 497));
        series2.getData().add(new XYChart.Data(Hillegersberg, 410));
        series2.getData().add(new XYChart.Data(HoekVanHolland, 10));
        series2.getData().add(new XYChart.Data(Hoogvliet, 70));
        series2.getData().add(new XYChart.Data(IJselmonde, 558));
        series2.getData().add(new XYChart.Data(Noord, 559));
        series2.getData().add(new XYChart.Data(Overschie, 485));
        series2.getData().add(new XYChart.Data(PrinsALexander, 405));

        Scene scene  = new Scene(bc,1500,1000);
        scene.getStylesheets().add("Stylesheet.css");
        bc.getData().addAll(series1,series2);
        stage.setScene(scene);
        stage.show();
    }
}