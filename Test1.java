 class animal{
void eat(){
System.out.println("eatting");
}
}
 class dog extends animal{
void bark(){
System.out.println("barking");
}
}
 class Test1{
public static void main(String[] args){
dog d =  new dog();
d.bark();
d.eat();
}
}