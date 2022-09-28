//Author Samuel Candor
import java.util.Scanner;

public class CSCE145_Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("What is your zodiac? Enter your birthday \nMonth followed by Day as numbers!");
Scanner keyboard = new Scanner(System.in);
			
	int month = keyboard.nextInt();
	int day = keyboard.nextInt();
			
//Setting up the parameters (invalid months and days)		
	//Days Less than 1 (General Rule)
		if (day <=0)
			{
				System.out.println("Invalid Day");
				System.exit(0);
			}
	//Months (General Rules)
		if (month >= 13)
			{
				System.out.println("Invalid Month");
			}
		else if (month <= 0)
			{
				System.out.println("Invalid Month");
			}
	//Months with 30 days
		//September
		else if (month == 9 & day >=31)
			{
				System.out.println("Invalid Day");
			}
		//April
		else if (month == 4 & day >=31)
			{
				System.out.println("Invalid Day");
			}
		//June
		else if (month == 6 & day >=31)
			{
				System.out.println("Invalid Day");
			}
		//November
		else if (month == 11 & day >=31)
			{
					System.out.println("Invalid Day");
			}
	//Months with 31 Days
		//January
		else if (month == 1 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//March
		else if (month == 3 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//May
		else if (month == 5 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//July
		else if (month == 7 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//August
		else if (month == 8 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//October
		else if (month == 10 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//December
		else if (month == 12 & day >=32)
			{
				System.out.println("Invalid Day");
			}
		//February
		else if (month == 2 & day >=30)
			{
				System.out.println("Invalid Day");
			}
		else
		{
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
	else if (month == 4)
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
	else if (month == 5)
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
	else if (month == 6)
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
	else if (month == 7)
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
	else if (month == 8)
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
	else if (month == 9)
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
	else if (month == 10)
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
	else if (month == 11)
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
	else if (month == 12)
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
	else if (month == 1)
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
	else if (month == 2)
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
			
}//bracket for else statement			
			
//Closing Brackets		
		}

	}

