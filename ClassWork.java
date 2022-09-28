import java.util.Scanner;

public class ClassWork {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Working with special characters
		//Allowed me to physically have quotes within the console and a print function
		//Allowed me to have separate lines within one line of code after defining the string 	
		//String str = "Hello, \n\" \n World";
		//System.out.println(str);

		//Working with scanners
		//Allowed me to type with the keyboard in the console
		//I can input a name then 2 numbers then it gives me my name and the first number	

		/*	
			Scanner keyboard = new Scanner(System.in);
			String name = keyboard.nextLine();
			System.out.println(name);
			int i = keyboard.nextInt();//Useful "fix up"
			keyboard.nextLine();
			double j = keyboard.nextDouble();
			keyboard.nextLine();//Useful "fix-up"
			System.out.println(name+" "+i);
		 */

		//Turning a string into an integer		
		//String str = "256";
		//int i = Integer.parseInt(str);
		//i*=2;
		//System.out.println(i);

		//Separates the name and and numbers inputted	
		/*

		Scanner keyboard = new Scanner(System.in);

		String input = keyboard.nextLine();
		System.out.println(input);

		String copyInput = input;
		int workingIndex = copyInput.indexOf(" ");

		String name = copyInput.substring(0, workingIndex);
		copyInput = copyInput.substring(workingIndex+1);

		System.out.println(name);
		System.out.println(copyInput);

		 */

		//Testing Boolean expressions				
		//boolean a = 12>=3;
		//if(a)//Or a == true
		//{
		//		System.out.println("Here");
		//}
		//else
		//{
		//System.out.println("Not here");
		//}
		//Branching Example
		/*	Scanner keyboard = new Scanner(System.in);
		System.out.print("Please give me 2 numbers: ");

		int a = keyboard.nextInt();
		int b = keyboard.nextInt();

		System.out.println("1.) Add\n2.) Substract");
		int ui = keyboard.nextInt();
		if (ui == 1)
		{
			int c = a + b;
			System.out.println(c);
		}
		else
		{
			int c = a - b;
			System.out.println(c);
		}

		 */
		//Nested Statements		
		/*
int a = 5;
int b = 5;
int c = 15;

if (a == b)
{
	System.out.println("A is equal to B");
	if (b == c)
	{
		System.out.println("B is equal to C");
	}
	else
	{
		System.out.println("B is not equal to C");
	}
}

		 */


		//else if
		/*
int a = 7;
int b = 6;

if (a == b)
{
	System.out.println("A is equal to B");
}
else if (a < b)
{
	System.out.println("A is less than B");
}
else
{
	System.out.println("A is greater than B");
}

		 */


		//Example of modulators
		/*		
int a = 5;
int b = 1;

int c = (a > b)?10:20;

//If a is greater than b, c = 10, otherwise c = 20

		 */

		/*
Scanner keyboard = new Scanner (System.in);

System.out.print("Type in quize grade:");
double quiz = keyboard.nextDouble();

System.out.print("Type in homework grade:");
double homework = keyboard.nextDouble();

System.out.print("Type in final grade:");
double finalGrade = keyboard.nextDouble(); 

System.out.println(quiz + " " + homework + " " + finalGrade);

double finalAverage = (quiz * .4) + (homework * .4) + (finalGrade * .2);

System.out.println("Final Average " + finalAverage);

if(finalAverage > 89)
{
	System.out.println("A");
}
else if(finalAverage > 79)
{
	System.out.println("B");
}
else if(finalAverage > 69)
{
	System.out.println("C");
}
else if(finalAverage > 59)
{
	System.out.println("D");
}
else
{
	System.out.println(":(");
}

		 */
		/*
int i = 4;
if(i*3>12)
{
	System.out.println("A");
	i--;
}
else if (i % 2 == 0)
{
	System.out.println("B");
	i++;
}
else if (i ==5)
{
	System.out.println("C");
	i +=2;
}
if (i / 2 == 2)
{
	System.out.println("D");
	i -=2;
}
else if(i*5 > 20)
{
	System.out.println("E");
	i /= 3;
}
else
{
	System.out.println("F");
	i %=12 ;
}
if (i < 100)
{
	System.out.println("G");
	i *= 3;
}
else
{
	System.out.println("H");
	i += 145;
}
System.out.println(i);

		 */

		//While loop example (Possible thing for game)
		/*
Scanner keyboard = new Scanner(System.in);

int a = 0;	
while (a<5)
{
	System.out.println("What is your name?");
	String name = keyboard.nextLine();
	a++;
}
System.out.println("No");
		 */

		//Do-While-Loop
		/*
do
{
	System.out.println("Gaga booga");
	a++;
}while(a<10);
		 */

		//Nested Loops
		/*
int i = 0;
int j = 0;



while (i < 10)
{
	while(j<10)
	{
		System.out.print("*");
		j++;
	}
	i++;
	j = 0;
	System.out.println();
}
		 */


		// example of  for loop: for(<<Init>> ; <<Boolean expression>> ; <<Update>>)
		/*
for (int i = 0; i < 10; i++)
{
	System.out.print(i + " ");
	System.out.println("Hello World");
}
		 */
		/*
Scanner keyboard = new Scanner(System.in);
for (int i = 0; i < 10; i++)
{
	System.out.println("Give me a number: ");
	int userInput = keyboard.nextInt();
	System.out.println("The input number was " + userInput);
	int multUserInput = userInput*10;
	System.out.println("The multiplied numer is: "+multUserInput);
}
		 */
		/*		
for (int i = 0; i< 10; i++)
{
	for (int j = 0; j<10; j++)
	{
		if (j ==5)
		{
			continue;
		}
		System.out.print("*");
	}
	System.out.println(" ");
}
		 */


		//Declaring an Array
		/*		
<<type>>[] <<id>>;


//Initializing an Array]
		<<id>> = new <<type>>[<<size>>];

or
		<<type>>[] <<id>> = new <<type>>[size];

		 */		
		/*		
int[] array = new int [10];

array[0] = 1;
array[array.length-1] = 5;

int sum = array[0] + array [array.length -1];

System.out.println(sum);
		 */
		//General array formats
		/*		
		int[] array = new int[5];

		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}

		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		 */
		/*
int[] userInputs = new int[5];
Scanner keyboard = new Scanner(System.in);
for(int i = 0; i < userInputs.length; i ++)
{
	userInputs[i] = keyboard.nextInt();
}
int sum = 0;

for(int i = 0; i < userInputs.length; i++)
{
	sum += userInputs[i];
}
System.out.println(sum);
		 */
		/*		
int[]array = {1,2,3,4,5};
boolean found=false;
Scanner keyboard = new Scanner(System.in);
System.out.println("Welcome to the printer");
int userInput = keyboard.nextInt();

for(int i = 0; i < array.length; i++)
{
	if(userInput == array[i])
	{
		found = true;
	}

}
if (found)
{
	System.out.println("Found the number!");
}
else
{
	System.out.println("Didn't find it:(");
}
		 */
		/*		
int[]array = {0,1,2,3,4};

int max = array[0];//Shouldn't be arbitrary use the first value of the array

for(int i = 0; i < array.length; i++)
{
	if(max<array[i])
	{
		max = array[1];
	}
	System.out.println(max);
}
		 */
		/*		
//Card Example (Sorting)		
int[]array = {4,2,1,3,5,0,9,-17,19,100,56};

//current index will be tracked by for loop
//swap position will also tracked by a for loop
int currMin = 0;
int minIndex = 0;

for(int i = 0; i < array.length; i++)
{
	currMin = array[i];
	minIndex = i;
	for(int j = i; j <array.length; j++)
	{
		if(currMin > array[j])
		{
			currMin = array[j];
			minIndex = j;
		}
	}
//traditional swapping code	
	int temp = array[i];
	array[i] = array[minIndex];
	array[minIndex]= temp;
}
for(int i = 0; i < array.length; i++)
{
	System.out.print(array[i] + " ");
}
		 */

//Multidimensional Arrays
		

		int[][] array = new int[2][3];

//{[],[],[]},
//{[],[],[]}
		System.out.println("Welcome to the multidimensional arrays");		


		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = j;
			}
		}

		for (int i = 0; i < array.length;i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]+ ",");
			}
			System.out.println();
		}


//More Multidimensional Arrays		

		String[][] array = new String[10][10];

		//Game board
		//10x10
		//Outside edge are *
		//(Eventually) add random obstacles
		//****
		//*  *
		//*  *
		//****

		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if (i== 0 || i == array.length - 1)
				{
					array[i][j] = "*";
				}
				else if(j == 0 || j== array[i].length-1)
				{
					array[i][j] = "*";
				}
				else
				{
					array[i][j] = " ";
				}
			}
		}

		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}


		///Closing brackets
	}

}
