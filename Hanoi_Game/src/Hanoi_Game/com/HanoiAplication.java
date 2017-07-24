package Hanoi_Game.com;
import java.util.Scanner;
import java.util.ArrayList;

public class HanoiAplication {

	public static void main(String[] args) 
	{
		//int numberOfSticks = 3;
		
		Scanner write = new Scanner(System.in);
		
		HanoiGame Game = new HanoiGame();
		
		System.out.println("Insert your nickname");
		String nam = write.nextLine();
		Game.setUserName(nam);
		System.out.println("Hello " + Game.userName);

		System.out.println("Insert number of discs");
		int nam2 = write.nextInt();
		Game.setNumberOfDiscs(nam2);
		
		System.out.println("THE GAME WILL BEGIN");
		
		Game.generateSticks(Game.numberOfDiscs);
		Game.showSticks(Game.numberOfDiscs);
		
		write.close();
	}

}
