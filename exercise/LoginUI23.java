import java.awt.*;

public class LoginUI23 {

    Label lLogin, lPw, lPress;
    TextField tLogin, tPw;
    Button ok;
    Panel p1, p2, p3;

    public LoginUI23(String msg) {
        Frame f = new Frame(msg);
        f.setLayout(new BorderLayout());

        // creation of objects for UI
        lLogin = new Label("Login");
        lPw = new Label("Password");
        lPress = new Label("Press");

        tLogin = new TextField(20);
        tPw = new TextField(20);
        tPw.setEchoChar('*');

        ok = new Button("OK");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        // attach UI-objects to Panels
        p1.add(lLogin);
        p1.add(tLogin);

        p2.add(lPw);
        p2.add(tPw);

        p3.add(lPress);
        p3.add(ok);


        // attach Panels to Frame
        f.add(lLogin);
        f.add(tLogin);
        f.add(lPw);
        f.add(tPw);
        f.add(lPress);
        f.add(ok);

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
