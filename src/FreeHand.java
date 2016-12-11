
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TPS5215
 */
public class FreeHand extends DrawShape {
    
    @Override
    //method to draw oval
    public void drawShape(int startx, int starty, int endx, int endy, Graphics fgg) {
        
        fgg.fillOval(startx, starty, endx , endy);
}
}
