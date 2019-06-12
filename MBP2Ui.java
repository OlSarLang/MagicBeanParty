/**Auhor: Oliver Sarholm Te13C Fredrika Bremer 2015-05-28
 /******************************************************/

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MBP2Ui {
    public int points = 0;
    public int health = 0;
    public void ui(MBP2Aim aim, MBP2Insects ins){
        SimpleWindow w = new SimpleWindow(500,500, "BeanPartyShooter");    //Creates a window (w) with the size 500,500 called BeanPartyShooter. This is where it all takes place.
        aim.mousex(w);  //x-coordinate for mouse click.
        aim.mousey(w);  //y-coordinate for mouse click.

        String name = JOptionPane.showInputDialog(null, "Write your name");    //You write your favorite dish.. Obviously..
        String [] difficulty = {"Easy", "Medium", "Hard", "INSANE"};    //Creates an array containing 4 elements from 0-3.

        int diff = JOptionPane.showOptionDialog(null, "Choose Difficulty", "Option", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, difficulty, difficulty[1]);   //This is your option window where you choose your difficulty, each difficulty will result in your health being higher or lower depending on what you choose.
        JOptionPane.showMessageDialog(null, name + " Press any key to continue");

        switch (diff) {    // In case you choose option one "Easy", it has spot 0 in the difficulty elements, the health will be set to 50. "Medium" - 1 - 40. etc.
            case 0:
                health = 50;
            case 1:
                health = 40;
            case 2:
                health = 30;
            case 3:
                health = 20;
        }
        while (health > 0 ) {    //While your health is over 0 it will draw the ui in SimpleWindow w.

            w.delay(50);
            w.waitForEvent();
            aim.shoot(w);   //Our x and y on mouse click.
            ins.insects(w, this);

            w.setLineColor(Color.black);
            w.setLineWidth(20);
            w.moveTo(40, 60);
            w.writeText("Name: " + name);

            w.moveTo(40, 80);
            w.writeText("Health: " + health);

            w.moveTo(40, 100);
            w.writeText("Points: " + points);

            background(w);


        }
    }
    private void background(SimpleWindow w){    //Creates the black Background around the edges of SimpleWindow w.
        w.setLineColor(Color.BLACK);
        w.setLineWidth(40);
        w.moveTo(0,20);
        w.lineTo(500,20);
        w.lineTo(500,480);
        w.lineTo(0, 480);
        w.lineTo(0,20);
    }
}
