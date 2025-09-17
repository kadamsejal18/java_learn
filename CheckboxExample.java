import java.awt.*;
import java.awt.event.*;
public class CheckboxExample{
public static void main(String[] args){
Frame f = new Frame("Checkbox example");
Checkbox c = new Checkbox("Check me");
c.addItemListener(new ItemListener(){
 public void itemStateChanged(ItemEvent e){
System.out.println("Checkbox state :" + (c.getState() ? "Checked" : "Unchecked"));
}
});
f.add(c);
f.setSize(300,200);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.addWindowListener (new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
});
}
}