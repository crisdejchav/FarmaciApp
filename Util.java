import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/**
 * Write a description of class Util here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Util
{
    public static ImageIcon getImage(String image){
        File i = new File("./media/"+image);
        try{
            BufferedImage bi = ImageIO.read(i);
            return new ImageIcon(bi);
        }catch(IOException ioe){
            return new ImageIcon(image);
        }
    }
}
