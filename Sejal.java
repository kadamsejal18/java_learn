import java.util.Random;
import java.util.Scanner;
public class Sejal1{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 0 for Rock,1 for paper,2 for Scissor");
int userInput = sc.nextInt();
Random random = new Random();
int computerInput = random.nextInt(3);
if(userInput == computerInput){
System.out.println("Draw")
}
else if(userInput == 0 && computer == 2 || userInput == 1 && computer == 0 || userInput == 2 && computer == 1){
System.out.println("you win");
}
else
{
System.out.println("Computer win ! ");
}
if(computerInput == 0){
System.out.println("Computer choice : Rock");
{
else if(computer == 1){
System.out.println("Computer choice : paper");
}
else if(computerInput ==2){
System.out.println("Computer choice : Scissor");
}
}
}












