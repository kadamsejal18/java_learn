public class reverse_array{
public static void main(String[] args){

int [] arr = {1,2,3,36,78};
int l = arr.length;
int n = l / 2;
int temp;

for(int i=0; i<n; i++){
//swap a[i] and a[l-1-i]
//a b temp
// |4| |3| ||
temp = arr[i];
arr[i] = arr[l-i-1];
arr[l-i-1] = temp;
}
for(int element : arr){
System.out.print(element + " ");
}
}
}