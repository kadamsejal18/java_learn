public class Matrix{ 
public static void main(String[] args){ 

int [][] a = {{2, 3, 4},{4 ,5, 6}}; 
int [][] b = {{4, 7, 6},{6, 9, 10}}; 
int [][] result = new int[2][3];
for (int i = 0;i < a.length;i++){ 
for (int j = 0;j < a[i].length;j++){
result[i][j] = a[i][j] + b[i][j]; 
}
}

for(int i = 0;i < result.length;i++){
for(int j = 0;j < result[i].length;j++){
System.out.print(result[i][j] + " "); 


} 
System.out.println();
}
}
}