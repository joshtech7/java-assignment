import java.util.Scanner;
public class Game{
	public static void main(String[] args){
	Scanner scissorrockpaper = new Scanner (System.in);

	System.out.print("Player one enter number:");
	int num1 = scissorrockpaper.nextInt();
	
	System.out.print("Player two enter number: ");
	int num2 = scissorrockpaper.nextInt();
	
	if(num1 > 0 ){
	System.out.println("A scissor can cut a paper");
	}
	if(num2 < 1){
	System.out.println("A rock can knock a scissor");
	}
	}
}