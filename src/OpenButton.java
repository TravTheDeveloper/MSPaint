
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author You
 */
public class OpenButton extends JButton{
    

         
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

     
              try {
                 BufferedImage image; 
                 image = ImageIO.read(new File("." + File.separator + "Icons" + File.separator + "open-file.png"));
                 g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), this);
              } catch (Exception ex) {
                 System.out.println("File Error");
              }

    }
    
}
    
