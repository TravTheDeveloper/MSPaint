
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
public class Rectangles extends DrawShape {
    
  
    
    @Override
    //method to draw rectangle
    public void drawShape(int startx, int starty, int endx, int endy, Graphics g) {
        int temp;
        
        if (startx > endx)
        {
        temp = endx;
        endx = startx;
        startx = temp;
        }
        
        if (starty > endy)
        {
        temp = endy;
        endy = starty;
        starty = temp;
        }
        
        
        if (Drawing.filled)
        g.fillRect(startx, starty, endx - startx, endy - starty); //draw shape filled
        else
         g.drawRect(startx, starty, endx - startx, endy - starty);

    }
}
