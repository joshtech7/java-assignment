import java.util.Scanner;
public class Arithmetic1{
	public static void main(String[] args){
	Scanner joshua = new Scanner(System.in);
	System.out.print("Enter first number");
	int number1 = joshua.nextInt();
	System.out.print("Enter second number");
	int number2 = joshua.nextInt();
	System.out.print("Enter third number");
	int number3 = joshua.nextInt();
	int sum = (number1 + number2 + number3); 
	int product = number1*number2*number3;
        int average = sum/3;

	
	System.out.println("Sum"+sum);
        System.out.println("Product"+product);
        System.out.println("Average"+average);
	}
}