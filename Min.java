public class Min{
public static void main(String[] args){
int [] arr = {1,2,45,33,89};
int min = arr[0];
for(int a: arr){
if(a < min){
min = a;
}
}
System.out.println("the value of the minimum element :" +min);
}
}