import java.awt.*;

public class GridBagLayoutCal extends Frame {
    TextField tf;
    
    public GridBagLayoutCal(){
        super("GridBag Test");

        //

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraint = new GridBagConstraints();
        setLayout(gridbag);

        constraint.fill = GridBagConstraints.BOTH;

        constraint.gridwidth = 1;
        constraint.weighty = 0.0;
        Button b_clear = new Button("C");
        gridbag.setConstraints(b_clear, constraint);
        add(b_clear);

        Button bx = new Button("x");
        gridbag.setConstraints(bx, constraint);
        add(bx);

        Button bd = new Button("/");
        gridbag.setConstraints(bd, constraint);
        add(bd);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        Button b_delete = new Button("DEL");
        gridbag.setConstraints(b_delete, constraint);
        add(b_delete);

        //
        

        constraint.gridwidth = 1;
        constraint.weighty = 0.0;
        Button b7 = new Button("7");
        gridbag.setConstraints(b7, constraint);
        add(b7);

        Button b8 = new Button("8");
        gridbag.setConstraints(b8, constraint);
        add(b8);

        Button b9 = new Button("9");
        gridbag.setConstraints(b9, constraint);
        add(b9);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        Button bp = new Button("+");
        gridbag.setConstraints(bp, constraint);
        add(bp);

        //

        constraint.gridwidth = 1;
        constraint.weighty = 0.0;
        Button b4 = new Button("4");
        gridbag.setConstraints(b4, constraint);
        add(b4);

        Button b5 = new Button("5");
        gridbag.setConstraints(b5, constraint);
        add(b5);

        Button b6 = new Button("6");
        gridbag.setConstraints(b6, constraint);
        add(b6);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        Button bm = new Button("-");
        gridbag.setConstraints(bm, constraint);
        add(bm);

        //

        constraint.gridwidth = 1;
        constraint.weighty = 0.0;
        Button b1 = new Button("1");
        gridbag.setConstraints(b1, constraint);
        add(b1);

        Button b2 = new Button("2");
        gridbag.setConstraints(b2, constraint);
        add(b2);

        Button b3 = new Button("3");
        gridbag.setConstraints(b3, constraint);
        add(b3);

        constraint.gridwidth = GridBagConstraints.REMAINDER;
        Button b_percent = new Button("%");
        gridbag.setConstraints(b_percent, constraint);
        add(b_percent);

        //

        constraint.gridwidth = 1;
        constraint.weighty = 0.0;
        Button b0 = new Button("0");
        gridbag.setConstraints(b0, constraint);
        add(b0);

        Button b_dot = new Button(".");
        gridbag.setConstraints(b_dot, constraint);
        add(b_dot);

        constraint.gridwidth = 2;
        constraint.gridheight = 1;
        Button be = new Button("=");
        gridbag.setConstraints(be, constraint);
        add(be);

        pack();
        setVisible(true);

    }
}