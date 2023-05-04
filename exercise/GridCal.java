import java.awt.*;


class GridCal{
    TextField tf;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button bp, bm, bx, bd, be;
    Button b_percent, b_dot, b_clear, b_delete;
    Panel p;

    public GridCal(String msg){
        Frame f = new Frame(msg);

        // display component
        tf = new TextField();

        // numeric button components
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        // operator button components
        bp = new Button("+");
        bm = new Button("-");
        bx = new Button("x");
        bd = new Button("/");
        be = new Button("=");


        b_percent = new Button("%");
        b_dot = new Button(".");
        b_clear = new Button("C");
        b_delete = new Button("DEL");

        // Panel (layout for buttons : using GridLayout(4,4))
        p = new Panel(new GridLayout(4,4));

        p.add(b_clear);
        p.add(bx); 
        p.add(bd);
        p.add(b_delete);

        p.add(b7); 
        p.add(b8);
        p.add(b9); 
        p.add(bp);

        p.add(b4);        
        p.add(b5); 
        p.add(b6); 
        p.add(bm);


        p.add(b1); 
        p.add(b2);
        p.add(b3); 
        p.add(b_percent);


        p.add(b0); 
        p.add(b_dot);
        p.add(be);

        // Frame layout : using BorderLayout(2,1)
        f.setLayout(new BorderLayout(2,1));
        f.add(tf, "North");
        f.add(p, "Center");

        f.setSize(600, 600);
        f.setVisible(true);
    }
}