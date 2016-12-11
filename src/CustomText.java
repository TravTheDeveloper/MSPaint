
import java.awt.Graphics;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author You
 */
public class CustomText extends DrawShape  {
    
    String text;
    
        public CustomText(String text){
           this.text = text;
        }
        
        
        
    @Override
    public void drawShape(int startx, int starty, int endx, int endy, Graphics g) {
         g.drawString(text, startx, starty);
    }
      
    
    
    
    
    
    
    
}
