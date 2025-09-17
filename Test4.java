class adder{
static int add(int a,int b){
return a+b;
}
static int add(int a,int b,int c){
return a+b+c;
}
}
class Test4{
public static void main(String[] args){
System.out.println(adder.add(11,12));
System.out.println(adder.add(22,32,50));
}
}
