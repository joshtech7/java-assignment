import java.util.Scanner;
public class Yearss{
	public static void main(String[] args){
	Scanner userInput = new Scanner(System.in);
	int hour = 60;
	int day = 24;
	int year = 365;

	System.out.println("Enter user minutes: ");
	int userMinutes = userInput.nextInt();

	int yearMinutes = hour*day*year;

	int years = userMinutes/yearMinutes;

	double days = (double)userMinutes%yearMinutes/(hour*day);

	System.out.printf("%d the minutes in year is %.0f days", years, days );
	}
}