import java.util.Scanner;

public class Accelerator{
	public static void main(String[] args){
	Scanner inputcollector = new Scanner (System.in);

	System.out.print("Enter the starting velocity");
	double velocity1 = inputcollector.nextDouble();

	System.out.print("Enter the ending velocity");
	double velocity2 = inputcollector.nextDouble();

	System.out.print("Enter the time");
	double time = inputcollector.nextDouble();

	double accelerator = (velocity1-velocity2/(time));

	System.out.printf(" the accelerator is %.2f" accelerator);
	}
}
	