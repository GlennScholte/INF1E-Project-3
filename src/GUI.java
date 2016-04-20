import Database.Parser;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class GUI extends Application {
    public static Stage window;
    public static Scene sceneHoofdmenu, sceneSelecteerGrafiekData, sceneSelecteerDiagramData, sceneGrafiek, sceneDiagramDiefstal, sceneDiagramFietsboxen;
    public static List<BuurtInfo> selected = new ArrayList();

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setResizable(false);

        //Button parser
        Button buttonParser = new Button("Parser");
        buttonParser.setOnAction(e -> {
            Parser.OpenDatabase();
            Parser.ParseTrommels("C:/Users/ThatMetalCoreBrony/Desktop/trommels.csv");
            BuurtInfo.update();
                });

        buttonParser.setTranslateY(-220);

        //Buttons back to Mainmenu
        Button buttonBackHoofdmenu1 = new Button("Back");
        buttonBackHoofdmenu1.setOnAction(e -> window.setScene(sceneHoofdmenu));
        buttonBackHoofdmenu1.setTranslateY(-220);

        Button buttonBackHoofdmenu2 = new Button("Back");
        buttonBackHoofdmenu2.setOnAction(e -> window.setScene(sceneHoofdmenu));
        buttonBackHoofdmenu2.setTranslateY(310);
        buttonBackHoofdmenu2.setTranslateX(-530);

        Button buttonBackHoofdmenu3 = new Button("Back");
        buttonBackHoofdmenu3.setOnAction(e -> window.setScene(sceneHoofdmenu));
        buttonBackHoofdmenu3.setTranslateY(630);
        buttonBackHoofdmenu3.setTranslateX(10);

        //Button back to Selectiemenu
        Button buttonBackSelectieMenu1 = new Button("Back");
        buttonBackSelectieMenu1.setTranslateY(310);
        buttonBackSelectieMenu1.setTranslateX(-530);

        //Button back to Diagram selectiemenu
        Button buttonBackSelectieMenu2 = new Button("Back");
        buttonBackSelectieMenu2.setTranslateY(640);
        buttonBackSelectieMenu2.setLayoutX(10);
        buttonBackSelectieMenu2.setOnAction(e -> {
            window.setScene(sceneSelecteerDiagramData);
        });

        Button buttonBackSelectieMenu3 = new Button("Back");
        buttonBackSelectieMenu3.setTranslateY(640);
        buttonBackSelectieMenu3.setLayoutX(10);
        buttonBackSelectieMenu3.setOnAction(e -> {
            window.setScene(sceneSelecteerDiagramData);
        });
        //Button show Grafiek menu
        Button button1 = new Button("Grafiek");
        button1.setTranslateX(-100);
        button1.setTranslateY(220);
        button1.setOnAction(e -> window.setScene(sceneSelecteerGrafiekData));

        //Button Show Diagram menu
        Button button2 = new Button("Diagram");
        button2.setTranslateX(100);
        button2.setTranslateY(220);
        button2.setOnAction(e -> window.setScene(sceneSelecteerDiagramData));

        //Layout 1 - children laid out in vertical column
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1, button2, buttonParser);
        sceneHoofdmenu = new Scene(layout1, 1200, 700);
        sceneHoofdmenu.getStylesheets().add("stylesheets/StylesheetHoofdmenu.css");

        //Keuzemenu Grafiek
        CheckBox box1   = new CheckBox(BuurtInfo.Charlois.getNaam());
        CheckBox box2   = new CheckBox(BuurtInfo.Delfshaven.getNaam());
        CheckBox box3   = new CheckBox(BuurtInfo.Feijenoord.getNaam());
        CheckBox box4   = new CheckBox(BuurtInfo.HillegersbergSchiebroek.getNaam());
        CheckBox box5   = new CheckBox(BuurtInfo.HoekVanHolland.getNaam());
        CheckBox box6   = new CheckBox(BuurtInfo.Hoogvliet.getNaam());
        CheckBox box7   = new CheckBox(BuurtInfo.IJsselmonde.getNaam());
        CheckBox box8   = new CheckBox(BuurtInfo.KralingenCrooswijk.getNaam());
        CheckBox box9   = new CheckBox(BuurtInfo.Noord.getNaam());
        CheckBox box10  = new CheckBox(BuurtInfo.Overschie.getNaam());
        CheckBox box11  = new CheckBox(BuurtInfo.Pernis.getNaam());
        CheckBox box12  = new CheckBox(BuurtInfo.PrinsAlexander.getNaam());
        CheckBox box13  = new CheckBox(BuurtInfo.RotterdamCentrum.getNaam());
        CheckBox box14  = new CheckBox(BuurtInfo.Rozenburg.getNaam());

        //Linker rij
        box1.setTranslateX(100);
        box1.setTranslateY(120);

        box2.setTranslateX(100);
        box2.setTranslateY(130);

        box3.setTranslateX(100);
        box3.setTranslateY(140);

        box4.setTranslateX(100);
        box4.setTranslateY(150);

        box5.setTranslateX(100);
        box5.setTranslateY(160);

        box6.setTranslateX(100);
        box6.setTranslateY(170);

        box7.setTranslateX(100);
        box7.setTranslateY(180);

        //Rechter rij
        box8.setTranslateX(900);
        box8.setTranslateY(-75);

        box9.setTranslateX(900);
        box9.setTranslateY(-65);

        box10.setTranslateX(900);
        box10.setTranslateY(-55);

        box11.setTranslateX(900);
        box11.setTranslateY(-45);

        box12.setTranslateX(900);
        box12.setTranslateY(-35);

        box13.setTranslateX(900);
        box13.setTranslateY(-25);

        box14.setTranslateX(900);
        box14.setTranslateY(-15);

        //Button show Grafiek
        Button showGrafiekButton = new Button("Show Grafiek");
        showGrafiekButton.setTranslateX(490);
        showGrafiekButton.setTranslateY(492);
        showGrafiekButton.setOnAction(e -> {
            Checkboxhandler.checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
        });

        //Button show diagram Diefstal
        Button buttonShowDiagramDiefstal = new Button("Diefstal");
        buttonShowDiagramDiefstal.setTranslateX(-100);
        buttonShowDiagramDiefstal.setTranslateY(220);
        buttonShowDiagramDiefstal.setOnAction(e -> window.setScene(sceneDiagramDiefstal));

        //Button show diagram Fietsboxen
        Button buttonShowDiagramFietsboxen = new Button("Fietsboxen");
        buttonShowDiagramFietsboxen.setTranslateX(100);
        buttonShowDiagramFietsboxen.setTranslateY(220);
        buttonShowDiagramFietsboxen.setOnAction(e -> window.setScene(sceneDiagramFietsboxen));

        //Layout Selectiemenu Grafiek
        VBox layoutSelectieMenuGrafiek = new VBox(0);
        layoutSelectieMenuGrafiek.getChildren().addAll(buttonBackHoofdmenu3, showGrafiekButton, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
        sceneSelecteerGrafiekData = new Scene(layoutSelectieMenuGrafiek, 1200, 700);
        sceneSelecteerGrafiekData.getStylesheets().add("stylesheets/StylesheetHoofdmenu.css");

        //Layout Selectiemenu Diagram
        StackPane layoutSelectieMenuDiagram = new StackPane();
        layoutSelectieMenuDiagram.getChildren().addAll(buttonBackHoofdmenu2, buttonShowDiagramDiefstal, buttonShowDiagramFietsboxen);
        sceneSelecteerDiagramData = new Scene(layoutSelectieMenuDiagram, 1200, 700);
        sceneSelecteerDiagramData.getStylesheets().add("stylesheets/StylesheetHoofdmenu.css");

        //Diagram Diefstal
        sceneDiagramDiefstal = new Scene(new Group(), 1200, 700);
        sceneDiagramDiefstal.getStylesheets().add("stylesheets/StylesheetCirkelDiagram.css");

        ObservableList<PieChart.Data> pieChartDataDiefstal = FXCollections.observableArrayList(
                new PieChart.Data(BuurtInfo.Charlois.getNaam()                  , BuurtInfo.Charlois.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Pernis.getNaam()                    , BuurtInfo.Pernis.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Delfshaven.getNaam()                , BuurtInfo.Delfshaven.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Feijenoord.getNaam()                , BuurtInfo.Feijenoord.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.HillegersbergSchiebroek.getNaam()   , BuurtInfo.HillegersbergSchiebroek.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.KralingenCrooswijk.getNaam()        , BuurtInfo.KralingenCrooswijk.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.RotterdamCentrum.getNaam()          , BuurtInfo.RotterdamCentrum.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.HoekVanHolland.getNaam()            , BuurtInfo.HoekVanHolland.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Hoogvliet.getNaam()                 , BuurtInfo.Hoogvliet.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.IJsselmonde.getNaam()               , BuurtInfo.IJsselmonde.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Noord.getNaam()                     , BuurtInfo.Noord.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Overschie.getNaam()                 , BuurtInfo.Overschie.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.PrinsAlexander.getNaam()            , BuurtInfo.PrinsAlexander.getAantalDiefstal()),
                new PieChart.Data(BuurtInfo.Rozenburg.getNaam()                 , BuurtInfo.Rozenburg.getAantalDiefstal())
        );

        final PieChart chartDiefstal = new PieChart(pieChartDataDiefstal);
        chartDiefstal.setTitle("Fietsdiefstal in de 14 buurten van Rotterdam");
        chartDiefstal.setTranslateY(150);
        chartDiefstal.setTranslateX(350);

        final Label captionDiefstal = new Label("");
        captionDiefstal.setTextFill(Color.WHITE);
        captionDiefstal.setStyle("-fx-font: 24 arial;");

        ((Group) sceneDiagramDiefstal.getRoot()).getChildren().add(chartDiefstal);
        ((Group) sceneDiagramDiefstal.getRoot()).getChildren().add(captionDiefstal);
        ((Group) sceneDiagramDiefstal.getRoot()).getChildren().add(buttonBackSelectieMenu2);

        //Diagram Fietsboxen
        sceneDiagramFietsboxen = new Scene(new Group(), 1200, 700);
        sceneDiagramFietsboxen.getStylesheets().add("stylesheets/StylesheetCirkelDiagram.css");

        ObservableList<PieChart.Data> pieChartDataFietsboxen = FXCollections.observableArrayList(
                new PieChart.Data(BuurtInfo.Charlois.getNaam()                  , BuurtInfo.Charlois.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Pernis.getNaam()                    , BuurtInfo.Pernis.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Delfshaven.getNaam()                , BuurtInfo.Delfshaven.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Feijenoord.getNaam()                , BuurtInfo.Feijenoord.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.HillegersbergSchiebroek.getNaam()   , BuurtInfo.HillegersbergSchiebroek.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.KralingenCrooswijk.getNaam()        , BuurtInfo.KralingenCrooswijk.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.RotterdamCentrum.getNaam()          , BuurtInfo.RotterdamCentrum.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.HoekVanHolland.getNaam()            , BuurtInfo.HoekVanHolland.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Hoogvliet.getNaam()                 , BuurtInfo.Hoogvliet.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.IJsselmonde.getNaam()               , BuurtInfo.IJsselmonde.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Noord.getNaam()                     , BuurtInfo.Noord.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Overschie.getNaam()                 , BuurtInfo.Overschie.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.PrinsAlexander.getNaam()            , BuurtInfo.PrinsAlexander.getAantalFietsboxen()),
                new PieChart.Data(BuurtInfo.Rozenburg.getNaam()                 , BuurtInfo.Rozenburg.getAantalFietsboxen())
        );

        final PieChart chartFietsboxen = new PieChart(pieChartDataFietsboxen);
        chartFietsboxen.setTitle("Fietstrommels in de 14 buurten van Rotterdam");
        chartFietsboxen.setTranslateY(150);
        chartFietsboxen.setTranslateX(350);
        chartFietsboxen.setScaleX(1);
        chartFietsboxen.setScaleY(1);
        chartFietsboxen.setLayoutX(1);
        chartFietsboxen.setLayoutY(1);

        final Label captionFietsboxen = new Label("");
        captionFietsboxen.setTextFill(Color.WHITE);
        captionFietsboxen.setStyle("-fx-font: 24 arial;");

        ((Group) sceneDiagramFietsboxen.getRoot()).getChildren().add(chartFietsboxen);
        ((Group) sceneDiagramFietsboxen.getRoot()).getChildren().add(captionFietsboxen);
        ((Group) sceneDiagramFietsboxen.getRoot()).getChildren().add(buttonBackSelectieMenu3);

        //Grafiek
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
        barChart.setTitle("Fietsdiefstal en Fietsboxen in Rotterdam");
        xAxis.setLabel("Buurt");
        yAxis.setLabel("Aantal");
        XYChart.Series diefstal = new XYChart.Series();
        diefstal.setName("Diefstal ×10");
        XYChart.Series fietsboxen = new XYChart.Series();
        fietsboxen.setName("Fietsboxen");
        barChart.getData().addAll(diefstal, fietsboxen);

        StackPane layout3 = new StackPane();
        layout3.getChildren().addAll(barChart, buttonBackSelectieMenu1);
        sceneGrafiek = new Scene(layout3, 1200, 700);
        sceneGrafiek.getStylesheets().add("stylesheets/StylesheetGrafiek.css");

        //Button Show Grafiek - Action
        showGrafiekButton.setOnAction(e -> {
            Checkboxhandler.checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
            for (BuurtInfo buurt : selected) {
                diefstal.getData().add(new XYChart.Data(buurt.getNaam(), buurt.getAantalDiefstal()));
                fietsboxen.getData().add(new XYChart.Data(buurt.getNaam(), buurt.getAantalFietsboxen()));
            };
            window.setScene(sceneGrafiek);
        });

        //Button Back to selection menu - Action
        buttonBackSelectieMenu1.setOnAction(e -> {
            window.setScene(sceneSelecteerGrafiekData);
            for (BuurtInfo buurt : selected) {
                diefstal.getData().clear();
                fietsboxen.getData().clear();}
            selected.clear();
        });

        //Display hoofdmenu at first
        window.setScene(sceneHoofdmenu);
        window.setTitle("");
        window.show();
    }
}

