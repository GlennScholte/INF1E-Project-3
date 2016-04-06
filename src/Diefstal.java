import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
/**
 * Created by eigenaar on 6-4-2016.
 */
public class Diefstal extends Application {
    final static String Centrum         = "Rotterdam Centrum";
    final static String Charlois        = "Charlois";
    final static String Delfshaven      = "Delfshaven";
    final static String Feijenoord      = "Feijenoord";
    final static String Hillegersberg   = "Hillegersberg";
    final static String HoekVanHolland  = "Hoek van Holland";
    final static String Hoogvliet       = "Hoogvliet";
    final static String Ijselmonde      = "Ijselmonde";
    final static String Noord           = "Noord";
    final static String Overschie       = "Overschie";
    final static String PrinsALexander  = "Prins Alexander";




    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("fiets diefstal");
        xAxis.setLabel("buurt");
        yAxis.setLabel("Aantal");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Diefstal");
        series1.getData().add(new XYChart.Data(Centrum, 2153));
        series1.getData().add(new XYChart.Data(Charlois, 99));
        series1.getData().add(new XYChart.Data(Delfshaven, 948));
        series1.getData().add(new XYChart.Data(Feijenoord, 697));
        series1.getData().add(new XYChart.Data(Hillegersberg, 0));
        series1.getData().add(new XYChart.Data(HoekVanHolland, 0));
        series1.getData().add(new XYChart.Data(Ijselmonde, 358));
        series1.getData().add(new XYChart.Data(Noord, 1259));
        series1.getData().add(new XYChart.Data(Overschie, 185));
        series1.getData().add(new XYChart.Data(PrinsALexander, 1395));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Fietsrommels");
        series2.getData().add(new XYChart.Data(Centrum, 25));
        series2.getData().add(new XYChart.Data(Charlois, 20));
        series2.getData().add(new XYChart.Data(Delfshaven, 10));





        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1,series2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}