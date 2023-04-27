import java.awt.*;
import java.awt.event.*;

class Popup23 implements ActionListener
{
    Frame f;
    Button b;
    PopupMenu popup;

    public Popup23(String msg){
        f = new Frame(msg);
        b = new Button("POPUPTEST");

        // registration event listener 버튼에 이벤트 처리 등록시키기
        b.addActionListener(this);

        popup = new PopupMenu("POP-UP");
        popup.add(new MenuItem("copy"));

        // attach popup to button
        b.add(popup);

        // attach UI-Objects to Frame
        f.add("Center", b);

        f.setSize(300, 300);
        f.setVisible(true);

    }
    // implementation for action event
    public void actionPerform(ActionEvent e){
        popup.show(b, 10, 30);
    }
}

// 실습