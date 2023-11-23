import java.util.Scanner;

public class DaimeterArea{

	public static void main(String[] args){

	Scanner diameter = new Scanner(System.in);

	System.out.print("Enter radius number");

	double radius = diameter.nextDouble();

	double areaOfCircle = 3.14*radius*radius;
	
	System.out.printf("%f%n Area of Circle is", areaOfCircle);
	}
}


