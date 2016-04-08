import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hoofdmenu extends Application{

    public Stage stage;

    @Override public void start(Stage showedStage) throws Exception {
        stage = showedStage;
        showedStage.setTitle("");

        CheckBox box1 = new CheckBox("Centrum");
        CheckBox box2 = new CheckBox("Charlois");
        CheckBox box3 = new CheckBox("Delfshaven");
        box1.setSelected(true);

        Button grafiekButton = new Button("Klik hier");
        grafiekButton.setOnAction(e -> {
            checkboxHandler(box1, box2, box3);
            Grafiek.display();
        });



        VBox testLayout = new VBox(20);
        testLayout.getChildren().addAll(grafiekButton, box1, box2, box3);

        Scene mainScene = new Scene(testLayout, 1500,1000);

        showedStage.setScene(mainScene);
        showedStage.show();
    }
    public static void checkboxHandler(CheckBox box1, CheckBox box2, CheckBox box3){
        String testMessage = "De gebruiker heeft geselecteerd:\n";

        if (box1.isSelected()) {
            testMessage += "Centrum\n";
        }
        if (box2.isSelected()) {
            testMessage += "Charlois\n";
        }
        if (box3.isSelected()) {
            testMessage += "Delfshaven\n";
        }
        System.out.println(testMessage);
    }
}