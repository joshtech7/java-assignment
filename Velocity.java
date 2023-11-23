import java.util.Scanner;
public class Acceleration{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your Velocity1:");
	double velocity1 = input.nextDouble();
	System.out.print("Enter your Velocity2:");
	double velocity2 = input.nextDouble();
	System.out.print("Enter your time");
	double time = input.nextDouble();

	double result = (velocity2 - velocity1)/time;
	System.out.printf("Your Average Acceleration is %.3f",result);
	}
}