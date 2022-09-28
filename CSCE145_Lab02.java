//Author Samuel Candor
import java.util.Scanner;
import java.util.Random;

public class CSCE145_Lab02 {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();

	System.out.print("What number would you like to test for?: ");	
//Setting up variables
//int counter is to limit the while statement
//int ui is to track user input
	int counter = 0;
	int ui = keyboard.nextInt();
	
//Integers to keep track of the number of rolls in the while statement		
	int rolled1 = 0;
	int rolled2 = 0;
	int rolled3 = 0;
	int rolled4 = 0;
	int rolled5 = 0;
	int rolled6 = 0;	
	
//Parameters
	if (ui <= 0)
	{
		System.out.println("Invalid number");
		System.exit(0);
	}
	else
	{
	
//Dice Input and Calculation
//Use of a nested while statement that contains a nested if statement to keep track of the total number of times a roll has occurred
	if (ui == 1)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 1)
			{
				rolled1 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("1 occured " + rolled1 + " times");
	}
	else if (ui == 2)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 2)
			{
				rolled2 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("2 occured " + rolled2 + " times");
	}
	else if (ui == 3)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 3)
			{
				rolled3 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("3 occured " + rolled3 + " times");
	}
	else if (ui == 4)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 4)
			{
				rolled4 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("4 occured " + rolled4 + " times");
	}
	else if (ui == 5)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 5)
			{
				rolled5 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("5 occured " + rolled5 + " times");
	}
	else if (ui == 6)
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
			if (diceRoll == 6)
			{
				rolled6 ++; 
			}
		}
		System.out.println(" ");
		System.out.println("6 occured " + rolled6 + " times");
	}
	else
	{
		while (counter <= 100)
		{
			int diceRoll = rand.nextInt(6) + 1;
			System.out.println(diceRoll);
			counter++;
		}
		System.out.println(" ");
		System.out.println(ui + " occured 0 times");
	}
	


	

	
	
	
	
	
	
	
	
	}
	
//Closing Brackets		
	}

}
