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

        //Buttons back to Mainmenu
        Button buttonBackHoofdmenu1 = new Button("Back");
        buttonBackHoofdmenu1.setOnAction(e -> window.setScene(sceneHoofdmenu));

        Button buttonBackHoofdmenu2 = new Button("Back");
        buttonBackHoofdmenu2.setOnAction(e -> window.setScene(sceneHoofdmenu));

        //Button back to Selectiemenu
        Button buttonBackSelectieMenu1 = new Button("Back");

        //Button back to Diagram selectiemenu
        Button buttonBackSelectieMenu2 = new Button("Back");
        buttonBackSelectieMenu2.setOnAction(e -> {
            window.setScene(sceneSelecteerDiagramData);
        });

        Button buttonBackSelectieMenu3 = new Button("Back");
        buttonBackSelectieMenu3.setOnAction(e -> {
            window.setScene(sceneSelecteerDiagramData);
        });
        //Button show Grafiek menu
        Button button1 = new Button("Grafiek");
        button1.setTranslateX(-100);
        button1.setOnAction(e -> window.setScene(sceneSelecteerGrafiekData));

        //Button Show Diagram menu
        Button button2 = new Button("Diagram");
        button2.setTranslateX(100);
        button2.setOnAction(e -> window.setScene(sceneSelecteerDiagramData));

        //Layout 1 - children laid out in vertical column
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1, button2);
        sceneHoofdmenu = new Scene(layout1, 1200, 700);

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

        //X
        box1.setTranslateX(-500);
        box2.setTranslateX(-500);
        box3.setTranslateX(-500);

        box4.setTranslateX(-400);
        box5.setTranslateX(-400);
        box6.setTranslateX(-400);

        box7.setTranslateX(600);
        box8.setTranslateX(600);
        box9.setTranslateX(600);

        box10.setTranslateX(900);
        box11.setTranslateX(900);
        box12.setTranslateX(900);

        //Y
        box1.setTranslateY(50);
        box2.setTranslateY(100);
        box3.setTranslateY(150);

        box4.setTranslateY(50);
        box5.setTranslateY(100);
        box6.setTranslateY(150);

        box7.setTranslateY(-45);
        box8.setTranslateY(-45);
        box9.setTranslateY(-45);

        box10.setTranslateY(-190);
        box11.setTranslateY(-190);
        box12.setTranslateY(-190);

        box1.setSelected(true);
        box2.setSelected(true);
        box3.setSelected(true);

        //Button show Grafiek
        Button showGrafiekButton = new Button("Show Grafiek");
        showGrafiekButton.setTranslateX(500);
        showGrafiekButton.setTranslateY(200);
        showGrafiekButton.setOnAction(e -> {
            GrafiekMenu.checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
        });

        //Button show diagram Diefstal
        Button buttonShowDiagramDiefstal = new Button("Diefstal");
        buttonShowDiagramDiefstal.setTranslateX(-100);
        buttonShowDiagramDiefstal.setOnAction(e -> window.setScene(sceneDiagramDiefstal));

        //Button show diagram Fietsboxen
        Button buttonShowDiagramFietsboxen = new Button("Fietsboxen");
        buttonShowDiagramFietsboxen.setTranslateX(100);
        buttonShowDiagramFietsboxen.setOnAction(e -> window.setScene(sceneDiagramFietsboxen));

        //Layout Selectiemenu Grafiek
        StackPane layoutSelectieMenuGrafiek = new StackPane();
        layoutSelectieMenuGrafiek.getChildren().addAll(buttonBackHoofdmenu1, showGrafiekButton, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
        sceneSelecteerGrafiekData = new Scene(layoutSelectieMenuGrafiek, 1200, 700);

        //Layout Selectiemenu Diagram
        StackPane layoutSelectieMenuDiagram = new StackPane();
        layoutSelectieMenuDiagram.getChildren().addAll(buttonBackHoofdmenu2, buttonShowDiagramDiefstal, buttonShowDiagramFietsboxen);
        sceneSelecteerDiagramData = new Scene(layoutSelectieMenuDiagram, 1200, 700);

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
        chartDiefstal.setTitle("Diefstal in de 14 buurten van Rotterdam");
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
        chartFietsboxen.setTitle("Diefstal in de 14 buurten van Rotterdam");
        chartFietsboxen.setTranslateY(150);
        chartFietsboxen.setTranslateX(350);

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
        diefstal.setName("Diefstal");
        XYChart.Series fietsboxen = new XYChart.Series();
        fietsboxen.setName("Fietsboxen");
        barChart.getData().addAll(diefstal, fietsboxen);

        StackPane layout3 = new StackPane();
        layout3.getChildren().addAll(barChart, buttonBackSelectieMenu1);
        sceneGrafiek = new Scene(layout3, 1200, 700);

        //Button Show Grafiek - Action
        showGrafiekButton.setOnAction(e -> {
            GrafiekMenu.checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
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
        window.setTitle("Title Here");
        window.show();
    }
}

