package Hanoi_Game.com;
import java.util.ArrayList;

public class HanoiGame 
{
	String userName;
	int numberOfDiscs;
	Disc[] stick1 = new Disc[numberOfDiscs];
	Disc[] stick2 = new Disc[numberOfDiscs];
	Disc[] stick3 = new Disc[numberOfDiscs];
	
	
	
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
	
	public void generateSticks(int nod)
	{
		 for (int i=0 ; i<nod ; i++)
		 {
			 stick1[i] = new Disc();
			 stick1[i].numberD = i+1;
			 
			 stick2[i] = new Disc();
			 
			 stick3[i] = new Disc();
		 }
	}
	
	public void showSticks(int nod)
	{
		for (int i=0; i<nod; i++)
		{
			System.out.print(stick1[i].numberD);
		}
	}
	
}
