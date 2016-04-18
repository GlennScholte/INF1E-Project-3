import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.image.ImageObserver;
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



        Button grafiekButton = new Button("Grafiek");
        grafiekButton.setTranslateX(300);
        grafiekButton.setTranslateY(240);
        grafiekButton.setOnAction(e -> {GrafiekMenu.display();
        });

        Button pieButton = new Button("Cirkel Diagram");
        pieButton.setTranslateX(600);
        pieButton.setTranslateY(165);
        pieButton.setOnAction(e -> {CirkelDiagramMenu.display();
        });

        Text text = new Text("Welcome");
        text.setTranslateX(340);
        text.setTranslateY(210);
        text.setId("fancytext");


        Text text3 = new Text("Rotterdam is a city that actively promotes cycling, so what better way of getting around than by bike. Unfortunately,\n bicycle theft is a real issue in Rotterdam. So use a guarded bike parking facility(fietstrommels) when possible.\n"+"There are several of them in several places of Rotterdam. We will show you all the save and unsave places,\n where your bicycle can be placed and also the statistics of bicycle theft in each area in Rotterdam");
        text3.setFont(Font.font ("Arial Black", FontWeight.BOLD, 15));
        text3.setFill(Color.WHITESMOKE);
        text3.setTranslateX(80);
        text3.setTranslateY(230);










        VBox testLayout = new VBox(20);

        testLayout.getChildren().addAll(text,text3, grafiekButton, pieButton);

        Scene mainScene = new Scene(testLayout, 1200,700);
        mainScene.getStylesheets().add("Stylesheet.css");
        showedStage.setScene(mainScene);
        showedStage.show();
    }







}