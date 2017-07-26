package Hanoi_Game.com;
//import java.util.Arrays;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.*;

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
		
		Disc[] stickWin = new Disc[Game.getNumberOfDiscs()];
		
//---------------------------------------------------------
		System.out.println("THE GAME WILL BEGIN");
		//System.out.println(Game.getNumberOfDiscs());
		Game.generateSticks(Game.getNumberOfDiscs(), stick1, stick2, stick3, stickWin);
		//System.arraycopy(stick1, 0, stickWin, 0, stick1.length);
		Game.showSticks(stick1,stick2,stick3);
		Game.showWinStick(stickWin);
//---------------------------------------------------------		
		/*int x = 0;
		
		do 
		{
			
			System.out.println("xxxxxx");
			
			if ((Arrays.equals(stickWin, stick2)) || Arrays.equals(stickWin, stick3))
			x = 1;
			else
			x=0;
		}
		while (x > 0);
			{
				System.out.println("\nCongratulations. You win!");
			};*/
		
		
		int resoult = 0;
		int licznik = 0;
		do
		{
			if(Game.comparisonSticks(Game.getNumberOfDiscs(), stick2) == Game.getNumberOfDiscs())
				{
				resoult = 0;
				}
			else if (Game.comparisonSticks(Game.getNumberOfDiscs(), stick3) == Game.getNumberOfDiscs())
			{
				resoult = 0;
			}
			else
				{
				resoult = 1;
				licznik++;
				System.out.println("Komunikat");
				//int zmienna = write.nextInt();
				}
			
		}
		while (resoult == 0);
		{
			System.out.println("\nCongratulations. You win!" + licznik);
		};
//---------------------------------------------------------
		
		write.close();
	}

}
