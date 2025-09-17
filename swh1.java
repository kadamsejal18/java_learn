public class swh1 {
public static void main(String[] args){
int result = sum(10,20);
System.out.println("result:"+result);
}
public static int sum(int x,int y){
int z;
if(x>y){
 z = x+y;
}
else{
z = (x+y)*2;
}
return z;
}
}
