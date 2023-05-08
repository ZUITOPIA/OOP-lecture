import javax.swing.*;
import java.awt.event.*;

public class JButtonImageLabelTest implements ActionListener {
    JPanel panel;
    JLabel label;
    JToggleButton button;

    public JButtonImageLabelTest(String msg){
        JFrame jf = new JFrame(msg);
        jf.setTitle("JButton Event Test");
        jf.setSize(1400,1400);

        panel = new JPanel();
        label = new JLabel("Click this button to see Image");
        button = new JToggleButton("See Image"); // 버튼을 누르기 전 ON으로 표시

        button.addActionListener(this);

        panel.add(label);
        panel.add(button);

        jf.add(panel);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
       if(button.isSelected()){ 
        // 버튼 클릭되었을 때
        ImageIcon me = new ImageIcon("juhee_logo.jpeg");
        label.setIcon(me);
        label.setText("This is Juhee!"); // 나의 사진과 함께 내가 고주희 임을 알리는 라벨로 지정
        button.setText("Close Image"); // 버튼을 눌러 이미지 닫기
       }
       else {
        label.setIcon(null); // 이미지 안 보여줌
        label.setText("Click this button to see Image"); // 라벨 원래대로 지정
        button.setText("See Image"); // 버튼을 눌러 이미지 열기
       }
       
    }
}