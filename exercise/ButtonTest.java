import java.awt.*;

public class ButtonTest{
    ButtonTest(){
        Frame f = new Frame("ButtonTest : KO");
        Button b = new Button("BUTTON");
        f.add(b);
        f.setSize(400,150);
        f.setVisible(true);
    }
}