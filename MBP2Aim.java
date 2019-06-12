/**Auhor: Oliver Sarholm Te13C Fredrika Bremer 2015-05-28
 /******************************************************/

import java.awt.*;
import java.util.ArrayList;

public class MBP2Aim{
    int mX = 0;
    int mY = 0;
    public int mousex(SimpleWindow w){ return w.getMouseX(); }
    public int mousey(SimpleWindow w){ return w.getMouseY(); }
    public void shoot(SimpleWindow w){
        mX = w.getMouseX();
        mY = w.getMouseY();
        System.out.println("MouseX: "+mX+" MouseY: "+mY);
    }


}
