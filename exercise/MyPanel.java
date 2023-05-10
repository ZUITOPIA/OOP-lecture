import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{
    public MyPanel(){
        // initialization for My Panel
        // 생성자에 아무것도 없는 상태임
    }

    public void paintComponent(Graphics g){
        g.drawRect(50, 60, 100, 100);
        g.drawOval(200, 60, 40, 80);
    }
}