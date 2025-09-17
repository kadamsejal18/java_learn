class Rectangle{
private int length;
private int breadth;
public Rectangle(){
this.length = 4;
this.breadth = 5;
}
public Rectangle(int length,int breadth){
this.length= length;
this.breadth=breadth;
}
public int getLength(){
return length;
}
public int getBreadth(){
return breadth;
}
}
public class swh3{
public static void main(String[] args){
Rectangle r = new Rectangle(12,56);
System.out.println(r.getLength());
System.out.println(r.getBreadth());
}
}
