import javafx.scene.control.CheckBox;

public class Checkboxhandler {

    public static void checkboxHandler(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5, CheckBox box6, CheckBox box7, CheckBox box8, CheckBox box9,CheckBox box10, CheckBox box11, CheckBox box12, CheckBox box13, CheckBox box14){
        if (box1.isSelected()) {
            GUI.selected.add(BuurtInfo.Charlois);
        }

        if (box2.isSelected()) {
            GUI.selected.add(BuurtInfo.Delfshaven);
        }

        if (box3.isSelected()) {
            GUI.selected.add(BuurtInfo.Feijenoord);
        }

        if (box4.isSelected()) {
            GUI.selected.add(BuurtInfo.HillegersbergSchiebroek);
        }

        if (box5.isSelected()) {
            GUI.selected.add(BuurtInfo.HoekVanHolland);
        }

        if (box6.isSelected()) {
            GUI.selected.add(BuurtInfo.Hoogvliet);
        }

        if (box7.isSelected()) {
            GUI.selected.add(BuurtInfo.IJsselmonde);
        }

        if (box8.isSelected()) {
            GUI.selected.add(BuurtInfo.KralingenCrooswijk);
        }
        if (box9.isSelected()) {
            GUI.selected.add(BuurtInfo.Noord);
        }
        if (box10.isSelected()) {
            GUI.selected.add(BuurtInfo.Overschie);
        }

        if (box11.isSelected()) {
            GUI.selected.add(BuurtInfo.Pernis);
        }

        if (box12.isSelected()) {
            GUI.selected.add(BuurtInfo.PrinsAlexander);
        }
        if (box13.isSelected()) {
            GUI.selected.add(BuurtInfo.RotterdamCentrum);
        }

        if (box14.isSelected()) {
            GUI.selected.add(BuurtInfo.Rozenburg);
        }
    }
}