package ergastirio;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class MyFrame extends JFrame implements ActionListener{

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    
    
    MyFrame(){
        this.setTitle("ΚΑΦΕΝΕΙΟ ΤΩΝ ΦΙΛΑΘΛΩΝ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        //this.setLayout(new FlowLayout()); //αμα θελω τα κουμπια στο κεντρικα-πανω
        this.setLayout(null);
        
        button1 = new JButton("Click here morty");
        button1.addActionListener(this);
        button1.setBounds(10,500, 200, 50);
        button1.setFocusable(false); //Διώχνω το περίγραμμα από το text
        this.add(button1);
        
        button2 = new JButton("Click also here if you like");
        button2.addActionListener(this);
        button2.setBounds(10, 570, 200, 50);
        button2.setFocusable(false);
        this.add(button2);
        
        button3 = new JButton("OK go with this");
        button3.setBounds(10, 640, 200, 50);
        button3.setFocusable(false);
        button3.addActionListener(this);
        this.add(button3);
      
        button4 = new JButton("Click here if you are sigma!");
        button4.setBounds(10, 700, 200, 50);
        button4.setFocusable(false);
        button4.addActionListener(this);
        this.add(button4);
        
        /*  PANEL SHIT
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(10,500, 200, 150);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        this.add(panel);
        */
       
        
        
        ImageIcon image = new ImageIcon("coffee.jpg");
        this.setIconImage(image.getImage());
        
        this.setVisible(true); //Πολλες φορες υπαρχει θεμα με τα κουμπια που εμφανιζονται αρα το visibility στο τελος
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            JOptionPane.showMessageDialog(null,"ΓΕΙΑ ΣΟΥ ΡΕ ΜΑΓΚΑ", "HI", JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource() == button2){
            JOptionPane.showMessageDialog(null,"ΟΞΩ ΠΟΥΣΤΗ ΚΙ ΑΣΧΗΜΕ", "title", JOptionPane.WARNING_MESSAGE);
        }
        else if(e.getSource() == button3){          
            JOptionPane.showMessageDialog(null,"ΑΧΟΥ ΜΩΡΕ ΑΝΝΟΥΛΑ ΒΛΕΠΩ ΤΗΝ ΑΝΝΟΥΛΑ", "JT2U", JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource() == button4){
           this.dispose(); 
           NewWindow window = new NewWindow();
        }
    }

    
}
