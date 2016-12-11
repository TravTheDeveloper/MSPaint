
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
public class RoundRect extends DrawShape {
    
   
    @Override
    //method to draw RoundRectangle
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
        g.fillRoundRect(startx, starty, endx - startx, endy - starty, 25, 25); //draw shape filled
        else
        g.drawRoundRect(startx, starty, endx - startx, endy - starty, 25, 25);
         

    }
}
