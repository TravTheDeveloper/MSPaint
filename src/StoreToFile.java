
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macuser
 */
public class StoreToFile implements Serializable {
    File f;
    
    
    
    public Image openFile()      
    {
        JFileChooser jfc = new JFileChooser("." + File.separator + "SavedImages");
        JOptionPane.showMessageDialog(null, "Select Image File to Open !");
        if (JFileChooser.APPROVE_OPTION == jfc.showOpenDialog(null)) // choose which file to open
        {
            f = jfc.getSelectedFile();      //set f equal to the file that user opened
        }
        else{}
            
        BufferedImage img = null;
        try {
            img = ImageIO.read(f);  // set Image equal to the image from the file
        } catch (Exception e) {}
      
        
        return img;     // Return the image
    }
    
    public void writeToFile(Image im) throws Exception
    {
        String filename = (String)JOptionPane.showInputDialog("                      Saving...\nPlease Enter Name of Image File! \n"); 
        // have the user create the image file name
  
        BufferedImage bi = (BufferedImage) im; // cast the image to a buffered image
        File outputfile = new File("." + File.separator + "SavedImages" + File.separator + filename + ".jpg");  // create a file name using the user created filename
        ImageIO.write(bi, "jpg", outputfile);  // write the image to the new created image file

    }
    
    
}
