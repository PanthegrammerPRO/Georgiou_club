package ergastirio;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class NewWindow extends JFrame implements ActionListener{
    
    JLabel label = new JLabel();
    JButton button1 = new JButton();
    JTextField text = new JTextField();
    
    NewWindow(){
       
        button1 = new JButton("Submit");
        button1.addActionListener(this);
        
        this.setTitle("Το ονοματάκι σου μάγκα");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(null);
        this.setLayout(new FlowLayout());
        
        text = new JTextField();
        text.setPreferredSize(new Dimension(300,50));
        
        
        this.add(text);
        this.add(button1);
        this.setVisible(true);
        this.pack();
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String name;
        if(e.getSource()==button1){
          this.dispose();
          name = text.getText();
          NewWindow1 window1 = new NewWindow1(name);
        }
    }

    
}
