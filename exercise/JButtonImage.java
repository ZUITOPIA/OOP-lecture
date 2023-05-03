import javax.swing.*;
import java.awt.event.*;

public class JButtonImage implements ActionListener{
    JPanel p;
    JLabel l;
    JButton b;

    public JButtonImage(String msg){    
        JFrame jf = new JFrame(msg);
        jf.setTitle("JButton Event Test");
        jf.setSize(1400,1400);

        // creation GUI components
        p = new JPanel();
        l = new JLabel("Click JButton to see Image");
        b = new JButton("See Image");

        // event listener setting
        b.addActionListener(this); // 이벤트 등록시켜줌

        // attach components to Frame
        p.add(l);
        p.add(b);
        jf.add(p);

        jf.setVisible(true);

    }

    // Event Handling
    public void actionPerformed(ActionEvent e)
{
    ImageIcon me = new ImageIcon("../Images/juhee_logo.jpeg");
    l.setIcon(me);
    l.setText("HELLO I'm JUHEE KO");
    b.setText("GOOD LUCK!");

    // 과제로 새로 짜줘야 할 코드 부분 : 토글버튼으로 만들어서 사진 보여줬다가 숨겼다가
}

}