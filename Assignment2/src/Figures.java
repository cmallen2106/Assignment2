//Assignment 2 - Figures
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Arrays; 
import java.util.Scanner; 

public class Figures {

	public static void main(String[] args) {
		
		//Create Scanner to read user input
		Scanner scan = new Scanner (System.in); 
		
		int size; 
		
		
		//Ask user for size of figure
		System.out.print("Enter the size of the figure (odd number): ");
		size = scan.nextInt(); 
		
		//If the user enters a number that is not odd, ask him/her to reenter the number until it is odd.
		while (size % 2 ==0) {
			System.out.println("Invalid - must be off number");
			System.out.println("Enter size of figure: "); 
			size = scan.nextInt(); 
		}
		
	}

}
