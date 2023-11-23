import java.util.Scanner;
public class Convert{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number in pounds: ");
	double pounds = scanner.nextDouble();
	double Kilograms = pounds*0.454;
	System.out.printf("the kilograms is %.3f", Kilograms);
	}
}
	