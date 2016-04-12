import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Grafiek {
    public static Hoofdmenu hoofdmenu;

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

        XYChart.Series fietsboxen = new XYChart.Series();
        fietsboxen.setName("Fietsboxen");

        for (BuurtInfo buurt : hoofdmenu.selected) {
            diefstal.getData().add(new XYChart.Data(buurt.getNaam(), buurt.getAantalDiefstal()));
            fietsboxen.getData().add(new XYChart.Data(buurt.getNaam(), buurt.getAantalFietsboxen()));
        }

        bc.getData().addAll(diefstal, fietsboxen);
        Scene scene = new Scene(bc, 1200,700);
        scene.getStylesheets().add("StylesheetGrafiek.css");
        window.setScene(scene);
        window.show();
        }
    }


