//import java.util.Scanner;

public class FactorialTable {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
          int a = 10;
        //int num = scanner.nextInt();
      //  scanner.close();

        System.out.println("Factorial Table:");
        System.out.println("-----------------");
        System.out.println("Number\tFactorial");

        for (int i = 1; i <= a; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "\t" + factorial);
        }
    }
}