class fruit{
void eat(){
System.out.println("eating");
}
}
class mango extends fruit{
void yummy(){
System.out.println("yummy 😋");
}
}
class orange extends fruit{
void juicy(){
System.out.println("juicy");
}
}
class test3{
public static void main(String[] args){
mango m = new mango();
orange o = new orange();
m.yummy();
m.eat();
o.juicy();
o.eat();
}
}