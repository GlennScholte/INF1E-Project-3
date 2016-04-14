import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CirkelDiagramMenu {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("");

        Button showGrafiekButton = new Button("show diefstal");
        showGrafiekButton.setTranslateX(400);
        showGrafiekButton.setTranslateY(200);
        showGrafiekButton.setOnAction(e -> {
            CirkelDiagramDiefstal.display();
        });

        Button showDiagramButton = new Button("show diagram");
        showGrafiekButton.setTranslateX(600);
        showGrafiekButton.setTranslateY(200);
        showGrafiekButton.setOnAction(e -> {
            CirkelDiagramFietsboxen.display();
        });

        VBox diagramMenuLayout = new VBox(0);
        diagramMenuLayout.getChildren().addAll(showGrafiekButton, showDiagramButton);

        Scene mainScene = new Scene(diagramMenuLayout, 1200, 700);
        mainScene.getStylesheets().add("StylesheetHoofdmenu.css");

        window.setScene(mainScene);
        window.show();
    }
}