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
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		System.out.println(input);
		
		String copyInput = input;
		int workingIndex = copyInput.indexOf(" ");
		
		String name = copyInput.substring(0, workingIndex);
		copyInput = copyInput.substring(workingIndex+1);
		
		System.out.println(name);
		System.out.println(copyInput);
		
	

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
		Scanner keyboard = new Scanner(System.in);
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
		
		
	}

}
