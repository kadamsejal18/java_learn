
import java.util.Scanner;
public class ATM{
public static void main(String[] args){
int balance = 1000000000,withdraw,deposit;
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println("ATM");
System.out.println("choose 1 for withdraw");
System.out.println("choose 2 for deposite");
System.out.println("choose 3 for check balance");
System.out.println("exit");
System.out.println("choose the operation you want to perform");
int choice = sc.nextInt();
switch(choice){
case 1 :
System.out.print("Enter money to be withdraw");
withdraw = sc.nextInt();
if(balance >= withdraw){
balance = balance - withdraw;
System.out.println("Please collect your money");
}
else
{
System.out.println("insufficient balance");
}
System.out.println("");
break;
case 2 :
System.out.println("enter money to be deposited");
deposit = sc.nextInt();
balance = balance + deposit;
System.out.println("your money successfully deposited");
System.out.println("");
break;
case 3 :
System.out.println("balance :" +balance);
System.out.println("");
break;
case 4 :
System.exit(0);
}
}
}
}









 











