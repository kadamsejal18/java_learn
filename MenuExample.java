import java.awt.*;
import java.awt.event.*;
public class MenuExample{
public static void main(String[] args){
Frame f = new Frame("Menu Example");
MenuBar mb = MenuBar();
Menu m = new Menu("File");
MenuItem mi = new MenuItem("Exit");
menuItem.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.exit(0);
}
});
m.add(mi);
mb.add(m);
f.setMenuBar(mb);
f.setSize(300,200);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
});
}
}