import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class GrafiekMenu{
    public static List<BuurtInfo> selected = new ArrayList();
    public static Scene window;

    public void start(Stage primaryStage) {

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

        box1.setTranslateX(50);
        box2.setTranslateX(50);
        box3.setTranslateX(50);

        box4.setTranslateX(300);
        box5.setTranslateX(300);
        box6.setTranslateX(300);

        box7.setTranslateX(600);
        box8.setTranslateX(600);
        box9.setTranslateX(600);

        box10.setTranslateX(900);
        box11.setTranslateX(900);
        box12.setTranslateX(900);

        //Y
        box1.setTranslateY(240);
        box2.setTranslateY(240);
        box3.setTranslateY(240);

        box4.setTranslateY(100);
        box5.setTranslateY(100);
        box6.setTranslateY(100);

        box7.setTranslateY(-45);
        box8.setTranslateY(-45);
        box9.setTranslateY(-45);

        box10.setTranslateY(-190);
        box11.setTranslateY(-190);
        box12.setTranslateY(-190);


        box1.setSelected(true);
        box2.setSelected(true);
        box3.setSelected(true);


        Button showGrafiekButton = new Button("show chart");
        showGrafiekButton.setTranslateX(500);
        showGrafiekButton.setTranslateY(200);
        showGrafiekButton.setOnAction(e -> {
            checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);
            Grafiek.display();
        });

        StackPane grafiekMenuLayout = new StackPane();
        grafiekMenuLayout.getChildren().addAll(showGrafiekButton, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14);

        window = new Scene(grafiekMenuLayout, 1200,700);
        window.getStylesheets().add("stylesheets/StylesheetHoofdmenu.css");
    }

    public static void checkboxHandler(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5, CheckBox box6, CheckBox box7, CheckBox box8, CheckBox box9,CheckBox box10, CheckBox box11, CheckBox box12, CheckBox box13, CheckBox box14){
        if (box1.isSelected()) {
            GUI.selected.add(BuurtInfo.Charlois);
        }

        if (box2.isSelected()) {
            GUI.selected.add(BuurtInfo.RotterdamCentrum);
        }

        if (box3.isSelected()) {
            GUI.selected.add(BuurtInfo.Delfshaven);
        }

        if (box4.isSelected()) {
            GUI.selected.add(BuurtInfo.Feijenoord);
        }

        if (box5.isSelected()) {
            GUI.selected.add(BuurtInfo.HillegersbergSchiebroek);
        }

        if (box6.isSelected()) {
            GUI.selected.add(BuurtInfo.HoekVanHolland);
        }

        if (box7.isSelected()) {
            GUI.selected.add(BuurtInfo.Hoogvliet);
        }

        if (box8.isSelected()) {
            GUI.selected.add(BuurtInfo.Rozenburg);
        }
        if (box9.isSelected()) {
            GUI.selected.add(BuurtInfo.IJsselmonde);
        }
        if (box10.isSelected()) {
            GUI.selected.add(BuurtInfo.KralingenCrooswijk);
        }

        if (box11.isSelected()) {
            GUI.selected.add(BuurtInfo.Noord);
        }

        if (box12.isSelected()) {
            GUI.selected.add(BuurtInfo.Overschie);
        }
        if (box13.isSelected()) {
            GUI.selected.add(BuurtInfo.PrinsAlexander);
        }

        if (box14.isSelected()) {
            GUI.selected.add(BuurtInfo.Pernis);
        }
    }

}