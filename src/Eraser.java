
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author You
 */
public class Eraser extends DrawShape {
    

    @Override
    //method to draw oval
    public void drawShape(int startx, int starty, int endx, int endy, Graphics fgg) {
        
        fgg.fillRect(startx, starty, endx , endy);
}
}
