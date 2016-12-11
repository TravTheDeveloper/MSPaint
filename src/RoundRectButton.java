
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macuser
 */
public class RoundRectButton extends JButton {
    
    
        public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRoundRect(3,1,this.getWidth() - 5, this.getHeight() - 5, 20, 10);

        
    }
    
    
    
    
    
    
}
