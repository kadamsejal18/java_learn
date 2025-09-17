[import java.util.Scanner;
public class DecimalToOctal{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the decimal number :");
int decimal = sc.nextInt();
String octal = Integer.toOctalString(decimal);
System.out.println("the octal equivalent is : " + octal);
}
}