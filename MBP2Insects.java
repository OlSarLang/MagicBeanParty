/**Auhor: Oliver Sarholm Te13C Fredrika Bremer 2015-05-28
 /******************************************************/

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MBP2Insects {

    private ArrayList<Square> insects = new ArrayList<>();  //An arraylist for enemy insects.
    long t0 = System.currentTimeMillis();
    public void insects(SimpleWindow w, MBP2Ui health){
        int x = (int)(Math.random()*450);   //x-coordinate for enemy.
        int y = 20;   //y-coordinate for enemy.

        if(x < 50){
            x = (int) Math.random() * 400+50;
        }

        w.setLineColor(Color.RED);

        if(System.currentTimeMillis()-t0 > 1000) {
            t0=System.currentTimeMillis();
            insects.add(new Square(x, y, 20));  //Creates the new enemies.
        }

        w.clear();

        for(int i = 0; i < insects.size(); i++) {
            if(insects.get(i).getY()<480){
                insects.get(i).move(0,20);
            }

            insects.get(i).draw(w);

            if(insects.get(i).getY() >= 480){
                health.health-=1;
                insects.remove(i);
            }

            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }

    }
}
