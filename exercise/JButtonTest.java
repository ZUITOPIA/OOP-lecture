import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JButtonTest {
    JButton strawberry, mandarin, watermelon, grape;

    public JButtonTest(String msg){
        JFrame jf = new JFrame(msg);
        jf.getContentPane().setLayout(new GridLayout(2,2));

        ImageIcon istrawberry = new ImageIcon("strawberry.jpeg");
        ImageIcon imandarin = new ImageIcon("mandarin.jpeg");
        ImageIcon iwatermelon = new ImageIcon("watermelon.jpeg");
        ImageIcon igrape = new ImageIcon("grape.jpeg");

        strawberry = new JButton(istrawberry);
        mandarin = new JButton(imandarin);
        watermelon = new JButton(iwatermelon);
        grape = new JButton(igrape);

        jf.getContentPane().add(strawberry);
        jf.getContentPane().add(mandarin);
        jf.getContentPane().add(watermelon);
        jf.getContentPane().add(grape);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 480);
        jf.setVisible(true);

    }
}