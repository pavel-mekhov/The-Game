package Constants.Images;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GuardianWOW {
    public static BufferedImage IMG_Flying_Right;
    public static BufferedImage IMG_Flying_Left;
    public static BufferedImage IMG_Standing_Still_Right_WOJet;
    public static BufferedImage IMG_Standing_Still_Left_WOJet;
    public static BufferedImage IMG_Standing_Still_Right_WJet;
    public static BufferedImage IMG_Standing_Still_Left_WJet ;
    public static BufferedImage IMG_Crouching_Right_WJet;
    public static BufferedImage IMG_Crouching_Left_WJet;



    static {
        try {
            IMG_Flying_Right = ImageIO.read(new File("src/Textures/Guardian/Flying_Right.png"));
            IMG_Flying_Left = ImageIO.read(new File("src/Textures/Guardian/Flying_Left.PNG"));
            IMG_Standing_Still_Right_WOJet = ImageIO.read(new File("src/Textures/Guardian/Standing_Still_Right_WOJet.png"));
            IMG_Standing_Still_Left_WOJet = ImageIO.read(new File("src/Textures/Guardian/Standing_Still_Left_WOJet.png"));
            IMG_Standing_Still_Right_WJet = ImageIO.read(new File("src/Textures/Guardian/PW_Standing_Still_Right_WJet.png"));
            IMG_Standing_Still_Left_WJet = ImageIO.read(new File("src/Textures/Guardian/Standing_Still_Left_WJet.png"));
            IMG_Crouching_Right_WJet = ImageIO.read(new File("src/Textures/Guardian/Crouching_Right_WJet.PNG"));
            IMG_Crouching_Left_WJet = ImageIO.read(new File("src/Textures/Guardian/Crouching_Left_WJet.PNG"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
