import java.awt.*;
import java.awt.event.*;
public class DialogExample{
public static void main(String[] args){
Frame f = new Frame("Dialog Example");
Button b = new Button ("show dialog");
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
Dialog d = new Dialog(f,"Dialog",true);
d.setLayout(new FlowLayout());
d.add(new Label("This is a dialog"));
Button closeButton = new Button("close");
closeButton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
d.dispose();
}
});
d.add(closeButton);
d.setSize(200,100);
d.setVisible(true);
}
});
f.add(b);
f.setSize(300,200);
f.setLayout(new FlowLayout());
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}
});
}
}