
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
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
public class NewFileButton extends JButton {
    
    
    
        @Override
    public void paint(Graphics g)
    {
        super.paint(g);
              try {
                 BufferedImage image; 
                 image = ImageIO.read(new File("." + File.separator + "Icons" + File.separator + "new-icon.png"));
                 g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), this);
              } catch (Exception ex) {
                 System.out.println("File Error");
              }

    }
}
