package ergastirio;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow1{
    
    JLabel label = new JLabel();
    JFrame frame2 = new JFrame();
    
    NewWindow1(String name1){
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(400,400);
        frame2.setLayout(null);
        frame2.setVisible(true);
        
        label.setBounds(0,0,400,400);
        label.setText("Hey " + name1);
        
        ImageIcon image2 = new ImageIcon("bateman.jpg");
        label.setIcon(image2);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFocusable(false);
        
        frame2.add(label);
    }
    
}
