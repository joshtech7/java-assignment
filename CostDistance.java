import java.util.Scanner;
public class CostDistance{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the driving distance (to the nearest 1 decimal point): ");
	double distance = userInput.nextDouble();

	System.out.print("Enter the fuel efficiency of the car, in miles per gallon (to the nearest 1 decimal point): ");
	double miles = userInput.nextDouble();

	System.out.print("Enter the price per gallon (to the nearest 2 decimal point):");
	double price = userInput.nextDouble();

	
	double costOfTrip =  (distance * price) / miles;
	
	System.out.printf("The cost of driving is $%.2f", costOfTrip);
	}
}