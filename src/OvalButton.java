
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
public class OvalButton extends JButton {
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawOval(3,3,this.getWidth() - 6, this.getHeight() - 6);
                
        
    }
    
    
    
    
    
    
}
