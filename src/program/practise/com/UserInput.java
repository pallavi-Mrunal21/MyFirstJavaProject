package program.practise.com;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		
		int number = input.nextInt();
		System.out.println("your entered number is:"+number);
		}

}
