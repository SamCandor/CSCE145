//Author Samuel Candor

import java.util.Scanner;


public class CSCE145_Lab03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
//Keeps track of the days		
		int daycounter=1;

//Introduction		
		System.out.println("Welcome to the below average temperature tester program:");
		System.out.println(" ");
		System.out.println("Please enter the temperature for day " + daycounter);
				
//Allows the user to input temperatures		
		double[] userInputs = new double[10];
		
		for(int i = 0; i < userInputs.length; i ++)
		{
			userInputs[i] = keyboard.nextDouble();
			daycounter ++;
			if (daycounter <11)
			{
				System.out.println("Please enter the temperature for day " + daycounter);
			}
		}
//Adds all of the input in the array together		
		double sum = 0;
		
		for(int i = 0; i < userInputs.length; i++)
		{
			sum += userInputs[i];
		}
//Calculates the final average		
		double average = sum / 10;
		
		System.out.println("The average tempterature was " + average);
		System.out.println(" ");
		System.out.println("The days that were below average were:");
		
//Outputs the days that were below average		
		for (int i =0; i < userInputs.length; i++)
		{
			if (userInputs[i] < average)
			{
				System.out.println("Day " + (i+1) + " with " + userInputs[i] + " degrees");
			}
		}
















		//Closing Brackets
	}

}
