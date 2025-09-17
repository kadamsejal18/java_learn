class My{
private int id;
private String name;
public String getName(){
return name;
}
public void setName(String n){
name = n;
}
public int getId(){
return id;
}
public void setId(int i){
id = i;
}
}
public class Cwh13{
public static void main(String[] args){
My sejal = new My();
sejal.setName("Code With Sejal");
System.out.println(sejal.getName());
sejal.setId(123);
System.out.println(sejal.getId());

}
}
