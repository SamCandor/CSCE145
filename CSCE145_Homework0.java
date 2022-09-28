//Author Samuel Candor

import java.util.Scanner;

public class CSCE145_Homework0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Welcome to the Binary Converter!");
	
//Prompts the user to enter a 4-digit binary number	
	System.out.println("To convert please enter your first 4 digits");

//Converts that string into substrings	
	String binary1 = keyboard.nextLine();
		binary1.substring(0,1);//first digit
		binary1.substring(1,2);//second digit
		binary1.substring(2,3);//third digit
		binary1.substring(3);//fourth digit
	
//Converts the substrings to a usable decimal		
	
	int a = Integer.parseInt (binary1.substring(0,1));
	int b = Integer.parseInt (binary1.substring(1,2));
	int c = Integer.parseInt (binary1.substring(2,3));
	int d = Integer.parseInt (binary1.substring(3));

//This does the calculation based on the power the numbers should be and combines them into a new variable
	int answer1 = a*8 + b*4 + c*2 + d*1;
	
//Prompts the user to enter a second 4-digit binary number	
	System.out.println("To convert please enter your second 4 digits");

//Converts that string into substrings	
	String binary2 = keyboard.nextLine();
		binary2.substring(0,1);//first digit
		binary2.substring(1,2);//second digit
		binary2.substring(2,3);//third digit
		binary2.substring(3);//fourth digit
	
//Converts the substring to a usable decimal
		
	int e = Integer.parseInt (binary2.substring(0,1));
	int f = Integer.parseInt (binary2.substring(1,2));
	int g = Integer.parseInt (binary2.substring(2,3));
	int h = Integer.parseInt (binary2.substring(3));
	
//This does the calculation based on the power the numbers should be and combines them into a new variable
	int answer2 = e*8 + f*4 + g*2 + h*1;
	
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
