package excellent;

//A Game to pick the correct number from 0-20
//The packages need in the program

import java.util.Random;
import java.util.Scanner;

public class Proj2i {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		
		int count=0;
		char t1='y';
		
		//We're initialing and finding the random number here.
		int x = new Random().nextInt(20);
		
		//Ask for user's name
		System.out.println("Enter your name :");
		String nm=scan.nextLine();
		
		
		
	
		System.out.println("\t \t \t \t \t \n" + " Your welcome " + "," + nm);

		//Enter user's choice to play the game or not .
		System.out.println("\nDo you want to play a game ?");
		System.out.println("\nPress y to continue OR  n  to cancel :");
		
		char input=scan.next().charAt(0);
					
		if(input!=t1)
		{
			System.out.println("Thanks for coming "+ nm);
		}
		
		else
		{
			
		do
		{
			
			//User enter's the number of his choice between 0-20
			System.out.println("\nEnter your lucky number ");
			int m=scan.nextInt();
			
			//The Logic for the game.
			if(m==x)
			{
				System.out.println("Your the winner , the answer is " + x);
				break;
			}
			
			else if(m<x)
			{
			System.out.println("Entered number is less than the true answer, try again"); 

			}
			
			else if(m>x)
			{
				System.out.println("Entered number is greater than the try try again");
				
			}
			
			else
			{
			System.out.println("Its the 5th time, number of chances are Over");
			}
		count++;
		}
			while(count!=5);
		System.out.println("\n Game Over");
		}
		scan.close();
	}
}
	
