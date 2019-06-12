/**Auhor: Oliver Sarholm Te13C Fredrika Bremer 2015-05-28
 /******************************************************/

//Importerar en klass för dialogrutor

public class OliversMagicBeanParty2 {
    public static void main (String[] args)  {
        MBP2Aim aim = new MBP2Aim();
        MBP2Ui gui = new MBP2Ui();
        MBP2Insects ins = new MBP2Insects();
        gui.ui(aim,ins);    //Gui is drawn with the use of the class ui located in MBP2Ui which requires MBP2Aim as well as MBP2Insects
    }
}

