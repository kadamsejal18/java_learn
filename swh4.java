class sphere{
int radius;
public sphere(int radius){
this.radius = radius;
}
public void setradius(int radius){
this.radius = radius;
}
public int getradius(){
return radius;
}
public double getsurface(){
return 4*3.14*radius*radius;
}
public double getvolume(){
return 4/3*3.14*radius*radius*radius;
}
}
public class swh4{
public static void main(String[] args){
sphere s = new sphere(12);
System.out.println(s.getradius());

System.out.println(s.getsurface());

System.out.println(s.getvolume());
}

}