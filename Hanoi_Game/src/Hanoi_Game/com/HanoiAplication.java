package Hanoi_Game.com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class HanoiAplication {

	public static void main(String[] args) 
	{
		Scanner write = new Scanner(System.in);
		
		HanoiGame Game = new HanoiGame();
//---------------------------------------------------------
		System.out.println("Insert your nickname");
		String nam = write.nextLine();
		Game.setUserName(nam);
		System.out.println("Hello " + Game.userName);

		System.out.println("Insert number of discs");
		int nam2 = write.nextInt();
		Game.setNumberOfDiscs(nam2);
		
		Disc[] stick1 = new Disc[Game.getNumberOfDiscs()];
		Disc[] stick2 = new Disc[Game.getNumberOfDiscs()];
		Disc[] stick3 = new Disc[Game.getNumberOfDiscs()];
//---------------------------------------------------------
		System.out.println("THE GAME WILL BEGIN");
		//System.out.println(Game.getNumberOfDiscs());
		Game.generateSticks(Game.getNumberOfDiscs(), stick1, stick2, stick3);
		Game.showSticks(stick1,stick2,stick3);
//---------------------------------------------------------		
		Game.play();
//---------------------------------------------------------
		write.close();
	}

}
