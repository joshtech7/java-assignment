


import java.util.Scanner;
public class FinancialApplication{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	int numberOfYears = 12;

	System.out.print("Enter investment amount, e.g, 1000.00: ");
	double investmentAmount = scanner.nextDouble();
	
	System.out.print("Enter numbers of years, e.g, 12years: ");
	double number = scanner.nextDouble();

	System.out.print("Enter monthly Interest Rate, e.g, 4.25%: ");
	double monthlyInterest = scanner.nextDouble();

	double futureInvestmentRate = monthlyInterest/numberOfYears;
	
	double accumulated = (investmentAmount * (1 + futureInvestmentRate)/numberOfYears);

	System.out.printf("%.2f accumulated value is $", accumulated);
	}
}
