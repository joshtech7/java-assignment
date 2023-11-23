import java.util.Scanner;
public class Celsius{
	public static void main(String[] args){

	Scanner Collector = new Scanner (System.in);

	System.out.print("Enter a degree");

	double degree =  Collector.nextDouble();

	double result = (9.0/5) * degree + 32;
	
	System.out.printf(" the result %f%n", result);
	}
}