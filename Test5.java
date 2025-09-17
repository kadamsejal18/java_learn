class adder{
static int add(int a,int b){
return a+b;
}
static int add(int a,int b,int c){
return a+b+c;
}
static int add(int a,int b,int c,int d){
return a+b+c+d;
}
}
class Test5{
public static void main(String[] args){
System.out.println(adder.add(11,12));
System.out.println(adder.add(22,32,50));
System.out.println(adder.add(44,88,98,99));

}
}
