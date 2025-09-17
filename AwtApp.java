import java.awt.*;
public class AwtApp extends Frame{
AwtApp(){
Label f1 = new Label("First Name");
f1.setBounds(20,50,80,20);
Label l1 = new Label("Last Name");
l1.setBounds(20,80,80,20);
Label dob = new Label("Date of Birth");
dob.setBounds(20,110,80,20);
TextField f1TF = new TextField();
f1TF.setBounds(120,50,100,20);
TextField l1TF = new TextField();
l1TF.setBounds(120,80,100,20);
TextField dobTF = new TextField();
dobTF.setBounds(120,110,100,20);
Button sbmt = new Button("Submit");
sbmt.setBounds(20,160,100,30);
Button reset = new Button("Reset");
reset.setBounds(120,160,100,30);
add(f1);
add(l1);
add(dob);
add(f1TF);
add(l1TF);
add(dobTF);
add(sbmt);
add(reset);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String[] args){
AwtApp awt = new AwtApp();
}
}