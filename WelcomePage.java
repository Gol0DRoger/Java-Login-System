import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    

    JFrame frame = new JFrame();
    JLabel WelcomeLabel = new JLabel("Hello!");

    WelcomePage(String userID){
        WelcomeLabel.setBounds(0,0,200,35);
        WelcomeLabel.setFont(new Font(null, Font.PLAIN,25));
        WelcomeLabel.setText("Welcome " + userID);
        WelcomeLabel.setForeground(Color.ORANGE);
        
        frame.add(WelcomeLabel);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
