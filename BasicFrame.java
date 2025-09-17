import java.awt.*;
import java.awt.event.*;

public class BasicFrame{
public static void main (String[] args){

        Frame f = new Frame("Basic Frame");
Panel p = new  Panel();
p.setLayout(new FlowLayout());
Label l = new Label("Hello, Awt!");

p.add(l);
        f.add(p);
        f.setSize(300,200);
        f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we){

System.exit(0);
    
}    
 });
}
} 