package ergastirio;
import java.awt.Color;
import java.awt.Label;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Ergastirio {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        MyFrame frame1 = new MyFrame();
        
        JLabel label = new JLabel();
        frame1.add(label);
        
        Border border = BorderFactory.createLineBorder(Color.red,3);// Για να μην έχω μόνο 1 label
        
        ImageIcon image1 = new ImageIcon("giorgos_georgiou.jpg");
        
        label.setText("ΚΑΛΩΣ ΗΡΘΕΣ ΣΤΟ ΚΑΦΕΝΕΙΟ ΤΩΝ ΦΙΛΑΘΛΩΝ ΡΕ ΜΑΓΚΑ"); //text labeling
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        //label.setForeground(Color.red);
        label.setIconTextGap(20);
        label.setBorder(border);
        label.setBounds(0,0,720,485);
        
        /*AUDIO
        File file = new File("GTA.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        */
    }
    
    
    
}
