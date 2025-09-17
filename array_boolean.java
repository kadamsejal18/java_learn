public class ArrayBoolean{
public static void main(String[] args){
boolean isSorted = true;
int[] arr = {1,12,3,445,78,45};
for(int i = 0;i<arr.length-1;i++){
if(arr[i] > arr[i+1]){
isSorted = false;
break;
}
}
if(isSorted){
System.out.println("The array is sorted ");
System.out.println("the array is not sorted");
}
}
}