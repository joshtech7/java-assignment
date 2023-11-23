import java.util.Scanner;
public class Game{
	public static void main(String[] args){
	Scanner scissorrockpaper = new Scanner (System.in);
	
	System.out.println("player one name:");
	String name1 = scissorrockpaper.nextLine();

	System.out.println("Player one enter number:");
	int num1 = scissorrockpaper.nextInt();

	System.out.println("player two name:");
	String name2 = scissorrockpaper.nextLine();

	System.out.println("Player two enter number: ");
	int num2 = scissorrockpaper.nextInt();
	
	if(num1>0 && num2<1){
	System.out.println("num1 %s%n A scissor can cut a paper");
	}
	if(num2<1 && num1>0){
	System.out.println("num2 %s%n A rock can knock a scissor");
	}
	}
}