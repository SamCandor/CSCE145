//Author: Samuel Candor

import java.util.Scanner; 

public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your zodiac? Enter your birthday \nMonth followed by Day as numbers!");
		Scanner keyboard = new Scanner(System.in);
		
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		
//Setting up the parameters (invalid months and days)		
		//Months
			if (month >= 13)
			{
				System.out.println("Invalid Month");
			}
			if (month <= 0)
			{
				System.out.println("Invalid Month");
			}
		//Days Less than 1
			if (day <=0)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
		//Months with 30 days
			//September
			if (month == 9 & day >=31)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//April
			if (month == 4 & day >=31)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//June
			if (month == 6 & day >=31)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//November
			if (month == 11 & day >=31)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
		//Months with 31 Days
			//January
			if (month == 1 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//March
			if (month == 3 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//May
			if (month == 5 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//July
			if (month == 7 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//August
			if (month == 8 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//October
			if (month == 10 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
			//December
			if (month == 12 & day >=32)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
		//February
			if (month == 2 & day >=30)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
//Zodiac Calculation
			//Each if statement calculates 2 possible signs
			//However, the comment labeling is based off of the date parameters as described in the lab report instructions
	
			
	//Aries	
		if (month == 3)
		{
				if (day  >= 21)
				{
					System.out.println("Aries!");
				}
				else
				{
					System.out.println("Pisces!");
				}
				
		}
		
	//Taurus	
		if (month == 4)
		{	
			if (day  >= 20)
			{
				System.out.println("Taurus!");
			}
			else
			{
				System.out.println("Aries!");
			}
		}
		
	//Gemini	
		if (month == 5)
		{	
			if (day  >= 21)
			{
				System.out.println("Gemini!");
			}
			else
			{
				System.out.println("Taurus!");
			}
		}
	
	//Cancer	
		if (month == 6)
		{	
			if (day  >= 21)
			{
				System.out.println("Cancer!");
			}
			else
			{
				System.out.println("Gemini!");
			}
		}
	
	//Leo	
		if (month == 7)
		{	
			if (day  >= 23)
			{
				System.out.println("Leo!");
			}
			else
			{
				System.out.println("Cancer!");
			}
		}
		
	//Virgo	
		if (month == 8)
		{	
			if (day  >= 23)
			{
				System.out.println("Virgo!");
			}
			else
			{
				System.out.println("Leo!");
			}
		}
	
	//Libra
		if (month == 9)
		{	
			if (day  >= 23)
			{
				System.out.println("Libra!");
			}
			else
			{
				System.out.println("Virgo!");
			}
		}
	
	//Scorpio	
		if (month == 10)
		{	
			if (day  >= 23)
			{
				System.out.println("Scorpio!");
			}
			else
			{
				System.out.println("Libra!");
			}
		}
		
	//Sagittarius
		if (month == 11)
		{	
			if (day  >= 22)
			{
				System.out.println("Sagittarius!");
			}
			else
			{
				System.out.println("Scorpio!");
			}
		}
	
	//Capricorn
		if (month == 12)
		{	
			if (day  >= 22)
			{
				System.out.println("Capricorn!");
			}
			else
			{
				System.out.println("Sagittarius!");
			}
		}
	
	//Aquarius
		if (month == 1)
		{	
			if (day  >= 20)
			{
				System.out.println("Aquarius!");
			}
			else
			{
				System.out.println("Capricorn!");
			}
		}
	
	//Pisces
		if (month == 2)
		{	
			if (day  >= 19)
			{
				System.out.println("{Pisces!");
			}
			else
			{
				System.out.println("Aquarius!");
			}
		}
		
		
		
//Closing Brackets		
	}

}

