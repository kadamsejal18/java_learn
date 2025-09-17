class bike{
void run(){
System.out.println("running");
}
}
class splender extends bike{
void run(){
System.out.println("running safely");
}
public static void main(String[] args){
bike b = new splender();
b.run();
}
} 