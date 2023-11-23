import java.util.Scanner;

public class MonthsDays{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter month");
	int month = input.nextInt();

	System.out.println("Enter year");
	int year = input.nextInt();
        
	if(year%4==0 && month==2)
	System.out.printf("february of %d is 29 days", year);
	
	else if(year%4 != 0 && month==2){
	
	System.out.printf("february of %d is 28 days", year);
	}
	
	if(month==1){
	
	System.out.printf("January of %d is 31 days", year);
	}
	if(year%4==0 && month==3){
	
	System.out.printf("march of %d is 31 days", year);
	}

	if(month==4){
	
	System.out.printf("April of %d is 29 days", year);
	}
	if(month==5){
	
	System.out.printf("May of %d is 31 days", year);
	}
	if(month==6){
	
	System.out.printf("June of %d is 30 days", year);
	}
	if(month==7){
	
	System.out.printf("July of %d is 31 days", year);
	}
	if(month==8){
	
	System.out.printf("August of %d is 31 days", year);
	}
	if(month==9){
	
	System.out.printf("September of %d is 30 days", year);
	}

	if(month==10){
	
	System.out.printf("October of %d is 31 days", year);
	}

	if(month==11){
	
	System.out.printf("November of %d is 30 days", year);
	}
	if(month==12){
	
	System.out.printf("December of %d is 31 days", year);
	}
	}

}
