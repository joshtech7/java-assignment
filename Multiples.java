import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
	Scanner bobbyjay = new Scanner(System.in);
	System.out.print("Enter first Integer1");
	int num1 = bobbyjay.nextInt();

	System.out.print("Enter second Integer2");
	int num2 = bobbyjay.nextInt();

	int tripple = num1*num1*num1;
	int twos = num2*num2;

	if(twos%tripple==0){
	System.out.print("it is a multiple");
	}
	else{
	System.out.print("is not a multiple");
	}
	}
}