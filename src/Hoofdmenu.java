import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Hoofdmenu extends Application{
    public Stage stage;

    static List checked = new ArrayList();

    @Override public void start(Stage showedStage) throws Exception {

        stage = showedStage;
        showedStage.setTitle("bycicle");

        //text
        Text text = new Text("welcome to SaveByc.");
        text.setTranslateX(320);
        text.setTranslateY(300);
        text.setId("fancytext");


        CheckBox box1 = new CheckBox("Centrum");
        CheckBox box2 = new CheckBox("Charlois");
        CheckBox box3 = new CheckBox("Delfshaven");
        CheckBox box4 = new CheckBox("Feijenoord");
        CheckBox box5 = new CheckBox("Noord");
        CheckBox box6 = new CheckBox("Pernis");
        CheckBox box7 = new CheckBox("Delfshaven");
        CheckBox box8 = new CheckBox("Kralingen/Crooswijk");
        CheckBox box9 = new CheckBox("Hoogvliet");
        CheckBox box10 = new CheckBox("Hoek van Holland");
        CheckBox box11 = new CheckBox("Ijselmonde");
        CheckBox box12 = new CheckBox("Overschie");
        CheckBox box13 = new CheckBox("Hilegersberg");
        CheckBox box14 = new CheckBox("Rozenburg");



        box1.setSelected(true);


        Button grafiekButton = new Button("show chart");
        grafiekButton.setTranslateX(640);
        grafiekButton.setTranslateY(320);

        grafiekButton.setOnAction(e -> {
            checkboxHandler(box1, box2, box3);
            Grafiek.display();
            System.out.println(checked);
        });

        VBox testLayout = new VBox(20);
        testLayout.getChildren().addAll( text, grafiekButton, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12);

        Scene mainScene = new Scene(testLayout, 1500, 1000);


        showedStage.setScene(mainScene);
        mainScene.getStylesheets().add("Stylesheet.css");
        showedStage.show();

    }





    public static void checkboxHandler(CheckBox box1, CheckBox box2, CheckBox box3){
        String testMessage = "De gebruiker heeft geselecteerd:\n";

        if (box1.isSelected()) {
            testMessage += "Centrum\n";
            checked.add("Centrum");
        }
        if (box2.isSelected()) {
            testMessage += "Charlois\n";
        }
        if (box3.isSelected()) {
            testMessage += "Delfshaven\n";
        }
        if (checked.contains("Centrum")){
            System.out.println("Add deze grafiek nu aan de volgende scene.");

        }
        System.out.println(testMessage);
    }
}