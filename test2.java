class family{
void happy(){
System.out.println("love home");
}
}
class boy extends family{
void naughty(){
System.out.println("naughty boy");
}
}
class girl extends boy{
void funny(){
System.out.println("funny girl");
}
}
class test2{
public static void main(String[] args){
girl g = new girl();
g.funny();
g.naughty();
g.happy();
}
}