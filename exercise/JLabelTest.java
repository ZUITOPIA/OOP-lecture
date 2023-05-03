import javax.swing.*;
import java.awt.*;

public class JLabelTest {
    JLabel label1, label2;

    public JLabelTest(String msg){
        JFrame jf = new JFrame(msg);
        jf.setTitle("Image Label Test");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.getContentPane().setBackground(Color.yellow);

        label1 = new JLabel("KOJUHEE");
        // label1.setFont(new Font("굴림체", Font.PLAIN, 20));
        ImageIcon logo = new ImageIcon("juhee_logo.jpeg");
        label2 = new JLabel("GJH", logo, JLabel.CENTER);
        jf.getContentPane().add("North", label1);
        jf.getContentPane().add("Center", label2);
        jf.setVisible(true);
    }
}