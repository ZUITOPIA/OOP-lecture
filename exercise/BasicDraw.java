import javax.swing.*;

public class BasicDraw {

    JFrame f;

    public BasicDraw(String msg){
        f = new JFrame(msg);

        // attach Drawed Panel
        f.add(new MyPanel()); // create My Draw

        f.setSize(550, 600);
        f.setVisible(true);
    }
}