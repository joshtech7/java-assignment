import java.util.Scanner;

public class SeperatingDigits{
public static void main(String[] args){

Scanner userInput = new Scanner(System.in);

System.out.print("Enter 5 Numbers: ");

int integers = userInput.nextInt();

int number1 = integers / 10000;

int remainder = integers % 10000;

int number2 = remainder / 1000;

int remainder1 = remainder % 1000;

int number3 = remainder1 / 100;

int remainder2 = remainder1 % 100;

int number4 = remainder2 / 10;

int number5 = remainder2 % 10;

System.out.printf("%d  %d  %d  %d  %d", number1,number2,number3,number4,number5);

	}
}