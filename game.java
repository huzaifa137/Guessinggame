package excellent;

import java.util.Random;
import java.util.Scanner;

public class Proj2i {
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your name :");
		String nm=scan.nextLine();
		
		int count=0;
		int x = new Random().nextInt(20);
		
		char t1='y';
		
	
		System.out.println("\t \t \t \t \t \n" + " Welcome "+ nm);

		System.out.println("\nDo you want to play a game ?");
		
		System.out.println("\nPress y or n to continue :-");
		
		char input=scan.next().charAt(0);
					
		if(input!=t1)
		{
			System.out.println("Thanks for coming "+ nm);
		}
		
		else
		{
			
		do
		{
			System.out.println(x);
			System.out.println("\nEnter your lucky number ");
			
			int m=scan.nextInt();
			if(m==x)
			{
				System.out.println("Your the winner , the answer is " + x);
				break;
			}
			
			else if(m<x)
			{
			System.out.println(" The number is else is less than the correct answer, try again"); 

			}
			
			else if(m>x)
			{
				System.out.println("The number is greater than the correct answer try again");
				
			}
			
			else
			{
			System.out.println("its the 5th time playing, Game Over");
			}
		count++;
		}
			while(count!=5);
		System.out.println("Game Over");
		}
		scan.close();
	}
}
	