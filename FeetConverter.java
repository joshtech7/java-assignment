import java.util.Scanner;
public class FeetConverter{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);	
	
	double oneFoot = 0.305;
	
	System.out.print("Enter a number in feet (55.5): ");
	double number = userInput.nextDouble();

	double meters = number * oneFoot;
	System.out.printf("meters is %.4f", meters);
	}
}