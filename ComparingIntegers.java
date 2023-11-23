import java.util.Scanner;
public class ComparingIntegers{
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);
		System.out.print("Enter integer number:");

		int inputInteger = input.nextInt();
		int  square =   inputInteger*inputInteger;
		if(inputInteger * square>100) {
		System.out.printf("number %d Square %d > 100", inputInteger, square);
		}

               if(inputInteger * square < 100){
		System.out.printf("number %d Square %d < 100", inputInteger, square);
		}

               if(inputInteger == 100){
		System.out.printf("number %d == 100", inputInteger);
		}


              if(inputInteger != 100){
		System.out.printf("number %d != 100", inputInteger);
		}

	}
}
