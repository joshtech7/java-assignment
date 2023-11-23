import java.util.Scanner;
public class RunwayLength{
	public static void main(String[] args){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Enter the speed: ");
	double speed = userInput.nextDouble();

	System.out.print("Enter acceleration: ");
	double acceleration = userInput.nextDouble();
	
	double length = (speed * speed / (2 * acceleration));

	System.out.printf("The minimum runway length for this airplane is %.3f", length);
	}
}