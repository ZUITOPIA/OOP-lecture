import java.awt.*;

// public class MenuTest extends Frame{
//     MenuTest mb;

//     public MenuTest(){
//         super("MenuBar Test");
//         mb = new MenuBar();
//         setMenuBar(mb);
//         Menu file = new Menu("File");
//         MenuItem fileNew = new MenuItem("New");
//         MenuItem fileOpen = new MenuItem("Opne");
//         MenuItem fileExit = new MenuItem("Exit");
//         file.add(fileNew);        file.addSeperator();
//         file.add(fileOpen);
//         file.addSeperator();
//         file.add(fileExit);
//         Menu edit = new Menu("Edit");
//         Menu sort = new Menu("Sort");
//         CheckboxMenuItem byname = new CheckboxMenuItem("by Menu");
//         CheckboxMenuItem bysize = new CheckboxMenuItem("by Size");
//         sort.add(byname);
//         sort.add(bysize);
//         edit.add(sort);

//         Menu help = new Menu("Help");
//         mb.add(file);
//         mb.add(edit);
//         mb.add(help);
//         mb.setHelpMenu(help); // 확인
//         setSize(250,250); // f. 없이?
//         setVisible(true); // f. 없이?
//     }
// }

// public class MenuTest{
//     MenuBar mb;

//     public MenuTest(String msg){
//         Frame f = new Frame(msg);

//         // Creation MenuBar
//         mb = new MenuBar();
//         f.setMenuBar(mb);

//         // Creation Menu
//         Menu file = new Menu("File");
//         Menu edit = new Menu("Edit");
//         Menu help = new Menu("Help");


//         // MenuItems for file Menu
//         MenuItem fileNew = new MenuItem("New");
//         MenuItem fileOpen = new MenuItem("Open");
//         MenuItem fileExit = new MenuItem("Exit");
//         file.add(fileNew); 
//         file.add(fileOpen);  
//         file.add(fileExit);

//         // CheckboxMenuItem for Edit Menu
//         Menu sort = new Menu("Sort");
//         CheckboxMenuItem byName = new CheckboxMenuItem("by Name");
//         CheckboxMenuItem bySize = new CheckboxMenuItem("by Size");
//         sort.add(byName);
//         sort.add(bySize);
//         edit.add(sort);

//         // attach Menus to MenuBar
//         mb.add(file);
//         mb.add(edit);
//         mb.add(help);

//         f.setSize(500,500);
//         f.setVisible(true);

//  }
// }

public class MenuTest {

    MenuBar mb;

    public MenuTest(String msg) {
        Frame f = new Frame(msg);

        // creation MenuBar
        mb = new MenuBar();
        f.setMenuBar(mb);

        // Creation Menu
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu help = new Menu("Help");

        // MenuItems for File Menu
        MenuItem fileNew = new MenuItem("New");
        MenuItem fileOpen = new MenuItem("Open");
        MenuItem fileExit = new MenuItem("Exit");
        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileExit);

        // CheckboxMenuItem for Edit Menu
        Menu sort = new Menu("Sort");
        CheckboxMenuItem byName = new CheckboxMenuItem("by Name");
        CheckboxMenuItem bySize = new CheckboxMenuItem("by Size");
        sort.add(byName);
        sort.add(bySize);
        edit.add(sort);

        // attach Menus to MenuBar
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        f.setSize(500, 600);
        f.setVisible(true);
    }
}
