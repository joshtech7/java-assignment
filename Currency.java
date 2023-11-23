import java.util.Scanner;
public class Year{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);

	int hour = 60;
	int day = 24;
	int year = 365;

	System.out.println("Enter numbers of minute: ");
	int userMinutes = userInput.nextInt();

	int yearMinutes = hour*day*year;

	int year1 = userMinutes/yearMinutes;

	double year2 = (double)userMinutes%yearMinutes(hour*day);
	
	System.out.printf("%d the year is %d year1 and %.0f year2", year1, year2);
	}
}
	 
