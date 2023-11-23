import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
	Scanner userInput = new Scanner (System.in);

	System.out.println("Enter set of even and odd numbers: ");

	int number1 = userInput.nextInt();
	int number2 = userInput.nextInt();
	int number3 = userInput.nextInt();
	int number4 = userInput.nextInt();
	int number5 = userInput.nextInt();
	int number6 = userInput.nextInt();
	int number7 = userInput.nextInt();
	int number8 = userInput.nextInt();
	int number9 = userInput.nextInt();
	int number10 = userInput.nextInt();

	int evenNumbers = 0;
	int oddNumbers = 0;
	
	if(number1%2 ==0){
	evenNumbers = evenNumbers + number1;
	}
	else{
	oddNumbers = oddNumbers + number1; 
	}
	
	if(number2%2 ==0){
	evenNumbers = evenNumbers + number2;
	}
	else{
	oddNumbers = oddNumbers + number2; 
	}
	
	if(number3%2 ==0){
	evenNumbers = evenNumbers + number3;
	}
	else{
	oddNumbers = oddNumbers + number3; 
	}	
	if(number4%2 ==0){
	evenNumbers = evenNumbers + number4;
	}
	else{
	oddNumbers = oddNumbers + number4; 
	}
	
	if(number5%2 ==0){
	evenNumbers = evenNumbers + number5;
	}
	else{
	oddNumbers = oddNumbers + number5; 
	}
	
	if(number6%2 ==0){
	evenNumbers = evenNumbers + number6;
	}
	else{
	oddNumbers = oddNumbers + number6; 
	}
	
	if(number7%2 ==0){
	evenNumbers = evenNumbers + number7;
	}
	else{
	oddNumbers = oddNumbers + number7; 
	}
	
	if(number8%2 ==0){
	evenNumbers = evenNumbers + number8;
	}
	else{
	oddNumbers = oddNumbers + number8; 
	}
	
	if(number9%2 ==0){
	evenNumbers = evenNumbers + number9;
	}
	else{
	oddNumbers = oddNumbers + number9; 
	}
	
	if(number10%2 ==0){
	evenNumbers = evenNumbers + number10;
	}
	else{
	oddNumbers = oddNumbers + number10; 
	}	
	System.out.println("evenNumbers " + evenNumbers + "oddNumbers" + oddNumbers);	
	}
}
