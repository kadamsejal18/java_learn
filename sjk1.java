public class sjk1 {
  public static void main(String[] args) {
    try {
      int num1 = 10;
      int num2 = 0;
      int result = num1 / num2; 
      System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: You cannot divide by zero!");
    }
  }
}