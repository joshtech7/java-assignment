import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");

int integerA = input.nextInt();

System.out.print("Enter second integer");
int integerB = input.nextInt();

int square1 = integerA^2;

int square2 = integerB^2; 
int sum = square1 + square2;
int result = square2-square1;

System.out.printf("the result %d%n", result);
	}
}

