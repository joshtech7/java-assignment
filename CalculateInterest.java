import java.util.Scanner;
public class CalculateInterest{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter balance: ");
	double balance = userInput.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double interestRate = userInput.nextDouble();

	double interest = (balance*(interestRate/1200));

	System.out.printf("interest is %.5f%n", interest);
	}
}