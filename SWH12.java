class Rectangle{
int length;
int width;

public int area(){
return length*width;
}
public int perimeter(){
return 2*(length+width);
}
}
public class SWh12{
public static void main(String[] args){
  rectangle rect =new rectangle();
rect.length = 4;
rect.width = 3;
System.out.println(rect.area());
System.out.println(rect.perimeter());
}
}