import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Hoofdmenu extends Application {
    public Stage stage;
    public static BuurtInfo buurtInfo;
    public static List<BuurtInfo> allebuurtenlijst = new ArrayList();



    @Override
    public void start(Stage showedStage) throws Exception {
        allebuurtenlijst.add(buurtInfo.RotterdamCentrum); allebuurtenlijst.add(BuurtInfo.Charlois); allebuurtenlijst.add(BuurtInfo.Charlois);
        stage = showedStage;
        showedStage.setTitle("");

        Label welcomeLabel = new Label("Ik wil graag zien:");

        Button grafiekButton = new Button("Grafiek");
        grafiekButton.setTranslateX(300);
        grafiekButton.setTranslateY(200);
        grafiekButton.setOnAction(e -> {
            GrafiekMenu.display();
        });

        Button pieButton = new Button("Cirkel Diagram");
        pieButton.setTranslateX(700);
        pieButton.setTranslateY(200);
        pieButton.setOnAction(e -> {
            CirkelDiagramMenu.display();
        });

        VBox testLayout = new VBox(20);

        testLayout.getChildren().addAll(welcomeLabel, grafiekButton, pieButton);

        Scene mainScene = new Scene(testLayout, 1200,700);
        showedStage.setScene(mainScene);
        showedStage.show();
    }
}