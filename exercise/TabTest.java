import java.awt.*;
import javax.swing.*;  // color 처리

class TabTest {

    JFrame jf;
    JTabbedPane tabpane;

    public TabTest(String msg){
            jf = new JFrame(msg);
            tabpane = new JTabbedPane();

            // creation Tabs : 3 Tabs
            JPanel one = new JPanel();
            JPanel two = new JPanel();
            JPanel three = new JPanel();

            // Tabs Background Setting
            one.setBackground(Color.red);
            two.setBackground(Color.green);
            three.setBackground(Color.blue);

            // Attach Image to Tabs : 1
            ImageIcon logo1 = new ImageIcon("../Images/"+"grape.jpeg");
            JLabel label1 = new JLabel("grape Logo", logo1, JLabel.RIGHT);
            label1.setFont(new Font(" 굴림", Font.BOLD, 30));
            one.add(label1);
            
            // Attach Image to Tabs : 2
            ImageIcon logo2 = new ImageIcon("../Images/"+"juhee_logo.jpeg");
            JLabel label2 = new JLabel("Juhee Logo", logo2, JLabel.RIGHT);
            label2.setFont(new Font(" 굴림", Font.BOLD, 30));
            two.add(label2);

            // Attach Image to Tabs : 3
            ImageIcon logo3 = new ImageIcon("../Images/"+"watermelon.jpeg");
            JLabel label3 = new JLabel("Watermelon Logo", logo3, JLabel.RIGHT);
            label3.setFont(new Font(" 굴림", Font.BOLD, 30));
            three.add(label3);

            tabpane.addTab("grape", one);
            tabpane.addTab("JUHEE", two);
            tabpane.addTab("watermelon", three);

            jf.getContentPane().add(tabpane, BorderLayout.CENTER);
            jf.setSize(400,400);
            jf.setVisible(true);
    }
}