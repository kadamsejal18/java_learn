public class test7{
public static void main(String[] args){
boolean isSorted = true;
int [] arr = {1,2,65,89,45,3};
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
isSorted = false;
break;
}
}
if(isSorted){
System.out.println("The array is sorted");
}
else{
System.out.println("The array is not sorted");
}
}
}