import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class Hoofdmenu extends Application{
    public Stage stage;
    public static List<BuurtInfo> selected = new ArrayList();

    @Override public void start(Stage showedStage) throws Exception {
        stage = showedStage;
        showedStage.setTitle("");

        CheckBox box1   = new CheckBox(BuurtInfo.Centrum.getNaam());
        CheckBox box2   = new CheckBox(BuurtInfo.Charlois.getNaam());
        CheckBox box3   = new CheckBox(BuurtInfo.West.getNaam());
        CheckBox box4   = new CheckBox(BuurtInfo.RotterdamCentrum.getNaam());
        CheckBox box5   = new CheckBox(BuurtInfo.Delfshaven.getNaam());
        CheckBox box6   = new CheckBox(BuurtInfo.Feijenoord.getNaam());
        CheckBox box7   = new CheckBox(BuurtInfo.HillegersbergSchiebroek.getNaam());
        CheckBox box8   = new CheckBox(BuurtInfo.HoekVanHolland.getNaam());
        CheckBox box9   = new CheckBox(BuurtInfo.Hoogvliet.getNaam());
        CheckBox box10  = new CheckBox(BuurtInfo.Rozenburg.getNaam());
        CheckBox box11  = new CheckBox(BuurtInfo.IJsselmonde.getNaam());
        CheckBox box12  = new CheckBox(BuurtInfo.KralingenCrooswijk.getNaam());
        CheckBox box13  = new CheckBox(BuurtInfo.Noord.getNaam());
        CheckBox box14  = new CheckBox(BuurtInfo.Overschie.getNaam());
        CheckBox box15  = new CheckBox(BuurtInfo.PrinsAlexander.getNaam());
        CheckBox box16  = new CheckBox(BuurtInfo.Pernis.getNaam());
        box1.setSelected(true);
        box2.setSelected(true);
        box3.setSelected(true);

        Button grafiekButton = new Button("Klik hier");
        grafiekButton.setOnAction(e -> {
            checkboxHandler(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15, box16);
            Grafiek.display();
        });

        VBox testLayout = new VBox(20);
        testLayout.getChildren().addAll(grafiekButton, box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15);

        Scene mainScene = new Scene(testLayout, 1200,700);

        showedStage.setScene(mainScene);
        showedStage.show();
    }

    public static void checkboxHandler(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5, CheckBox box6, CheckBox box7, CheckBox box8, CheckBox box9,CheckBox box10, CheckBox box11, CheckBox box12, CheckBox box13, CheckBox box14, CheckBox box15, CheckBox box16){
        if (box1.isSelected()) {
            selected.add(BuurtInfo.Centrum);
        }
        if (box2.isSelected()) {
            selected.add(BuurtInfo.Charlois);
        }
        if (box3.isSelected()) {
            selected.add(BuurtInfo.West);
        }
        if (box4.isSelected()) {
            selected.add(BuurtInfo.RotterdamCentrum);
        }
        if (box5.isSelected()) {
            selected.add(BuurtInfo.Delfshaven);
        }
        if (box6.isSelected()) {
            selected.add(BuurtInfo.Feijenoord);
        }
        if (box7.isSelected()) {
            selected.add(BuurtInfo.HillegersbergSchiebroek);
        }
        if (box8.isSelected()) {
            selected.add(BuurtInfo.HoekVanHolland);
        }
        if (box9.isSelected()) {
            selected.add(BuurtInfo.Hoogvliet);
        }
        if (box10.isSelected()) {
            selected.add(BuurtInfo.Rozenburg);
        }
        if (box11.isSelected()) {
            selected.add(BuurtInfo.IJsselmonde);
        }
        if (box12.isSelected()) {
            selected.add(BuurtInfo.KralingenCrooswijk);
        }
        if (box13.isSelected()) {
            selected.add(BuurtInfo.Noord);
        }
        if (box14.isSelected()) {
            selected.add(BuurtInfo.Overschie);
        }
        if (box15.isSelected()) {
            selected.add(BuurtInfo.PrinsAlexander);
        }
        if (box16.isSelected()) {
            selected.add(BuurtInfo.Pernis);
        }
    }
}