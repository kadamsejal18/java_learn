class cylinder{
int radius;
int height;
public cylinder(int radius,int height)
{
this.radius = radius;
this.height = height;
}
public void setRadius(int radius){
this.radius = radius;
}
public int getRadius(){
return radius;
}
public void setHeight(int height){
this.height = height;
}

public int getHeight(){
return height;
}
public class swh2{
public static void main(String[] args){
cylinder b = new cylinder(9,12);
b.setHeight(12);
System.out.println(b.getHeight());
b.setRadius(9);
System.out.println(b.getRadius());
}
}
}
