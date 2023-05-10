import javax.swing.*;

class PolyLine{

    JFrame f;

    public PolyLine(String msg){
        f = new JFrame(msg);
        f.add(new MyPolyLine());

        f.setSize(600,600);
        f.setVisible(true);
    }
}