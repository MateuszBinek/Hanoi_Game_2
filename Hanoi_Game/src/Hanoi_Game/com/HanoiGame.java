package Hanoi_Game.com;
//import java.util.ArrayList;
//import java.util.*;

public class HanoiGame 
{
	String userName;
	private int numberOfDiscs;
//---------------------------------------------------------
	void setUserName(String name)
	{
		userName = name;
	}
	
	void setNumberOfDiscs(int i)
	{
		numberOfDiscs = i;
	}
	
	int getNumberOfDiscs()
	{
		return numberOfDiscs;
	}
//---------------------------------------------------------
	public void generateSticks(int nod,Disc stick1[], Disc stick2[], Disc stick3[], Disc stickWin[])
	{
		int hv = nod;
		
		 for (int n=0 ; n<numberOfDiscs ; n++)
		 {
			 stick1[n] = new Disc();
			 stick1[n].numberD = hv;
			 
			 stick2[n] = new Disc();
			 stick2[n].numberD = 0;
			 
			 stick3[n] = new Disc();
			 stick3[n].numberD = 0;
			 
			 stickWin[n] = new Disc();
			 stickWin[n].numberD = hv;
			 
			 hv--;
		 }
	}
//---------------------------------------------------------
	public void showSticks(Disc stick1[], Disc stick2[], Disc stick3[])
	{
		// STICK 1
		System.out.print("STICK 1 -");
		for (int n=0; n<stick1.length; n++)
		{
			System.out.print(" " + stick1[n].getNumber());
		}
		
		// STICK 2
		System.out.print("\nSTICK 2 -");
		for (int n=0; n<stick2.length; n++)
		{
			System.out.print(" " + stick2[n].getNumber());
		}
		
		// STICK 3
		System.out.print("\nSTICK 3 -");
		for (int n=0; n<stick3.length; n++)
		{
			System.out.print(" " + stick3[n].getNumber());
		}
	}
//---------------------------------------------------------
	public void showWinStick(Disc stick[])
	{
		// STICK WIN
		System.out.print("STICK WIN -");
		for (int n=0; n<stick.length; n++)
		{
			System.out.print(" " + stick[n].getNumber());
		}
		
	}
//---------------------------------------------------------
	public boolean comparisonSticks(Disc[] st1, Disc[] st2)
	{
		int x = 0;
		for (int i=0; i<st1.length ; i++)
		{
			if (st1[i].getNumber() != st2[i].getNumber())
				{
				x=0;
				}	
			else
			{
				x=1;
			}
		}
		if (x==1)
			return true;
		else
			return false;
	}
//------------------------GAME-----------------------------
	/*public void moveDisc(int a, int b)
	{
		int hv;
		for 
		
	}*/
}
