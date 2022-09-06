//Author Samuel Candor

import java.util.Scanner;

public class Homework0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Introductory statement that defines variables based on numbers entered
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Binary? Hardly know her...lets fix that");
		System.out.println("To convert please enter your first 4 digits 1 at a time");
		
			int a = keyboard.nextInt();
			int b = keyboard.nextInt();
			int c = keyboard.nextInt();
			int d = keyboard.nextInt();

//This does the calculation based on the power the numbers should be and combines them into a new variable
		int answer1 = a*8 + b*4 + c*2 + d*1;
		
		System.out.println(answer1);
		
//This prompts the users to do the same thing with another binary combination		
		
		System.out.println("Please enter the second 4 digits 1 at a time");
		
			int e = keyboard.nextInt();
			int f = keyboard.nextInt();
			int g = keyboard.nextInt();
			int h = keyboard.nextInt();
		
		int answer2 = e*8 + f*4 + g*2 + h*1;
		
		System.out.println(answer2);
		
//Next, there's a boolean asking the user if they would like the two final numbers (the new variables) added together		
		
		System.out.println("Would you like to add them together? \n 1) Yes 0) NO");
	
//Here the only valid answer is 1 which combines answer1 and answer2 into the final variable finalAnswer		
		int ui = keyboard.nextInt();
		if (ui == 1)
		{
			int finalAnswer = answer1 + answer2;
			System.out.println("Final Answer: ");
			System.out.println(finalAnswer);
			
			System.out.println("");
			System.out.println("Thank you for using this converter!");
		}
		else
		{
			System.out.println("Fine :(");
		}
		
	}

}
