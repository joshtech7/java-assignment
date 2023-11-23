import java.util.Scanner;
public class Celsius{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a degree in Celsuis");
	int input = input.nextDouble();
	int result = (9/5) * input /32;
	System.out.print("%f%n Result is " result);
	}
}