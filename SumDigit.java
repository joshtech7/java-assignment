import java.util.Scanner;
public class SumDigit{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	 
	int sum = 0;	

	System.out.print("Enter an Integer between (0 and 1000): ");
	int number1 = userInput.nextInt();

        int digit1 = number1 % 10;
	sum = sum + digit1;
	int rem1= number1/10; 
	
	int digit2 = number1 % 10;
	sum = sum + digit2;
	int rem2 = number1/10;

	int digit3 = number1 % 10;
	sum = sum + digit3;
	int rem3 = number1/10;

	System.out.printf("sum is %d", sum);
	}
}