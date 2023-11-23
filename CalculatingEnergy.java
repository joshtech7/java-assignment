import java.util.Scanner;
public class CalculatingEnergy{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	
	double weight = 55.5;

	System.out.print("Enter the amount of water in kilograms: "); 
	double kilograms = userInput.nextDouble();

	System.out.print("Enter the amount of water in initial Temperature: "); 
	double initial = userInput.nextDouble();

	System.out.print("Enter the final temperature: "); 
	double result = userInput.nextDouble();
	
	double energy = weight * (result - initial) * 4184;

	System.out.printf("The energy needed is %.1f", energy);
	
	}
}