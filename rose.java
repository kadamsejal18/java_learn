public class rose{

static int factorial_itt(int n){
if(n==0 || n==1){
return 1;
}
else{
int product=1;
for(int i=1;i<=n;i++){
product*=i;
}
return product;
}
}
public static void main(String[] args){
int n=4; 
System.out.println("factorial n:" + factorial_itt(n));
}
}
