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
		int menuSelect; 
		boolean hasNotQuit = true; 
		
		
		//Ask user for size of figure
		System.out.print("Enter the size of the figure (odd number): ");
		size = scan.nextInt(); 
		
		//If the user enters a number that is not odd, ask him/her to reenter the number until it is odd.
		while (size % 2 ==0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.println("Renter the size of teh figure: "); 
			size = scan.nextInt(); 
		}
		
		//Enter a loop in which you will display a menu of choices (1-4) and wait for user input
		while (hasNotQuit == true) {
			printMenu(); 
			menuSelect = scan.nextInt(); 
			System.out.println();
			
			//printBox
			if (menuSelect == 1) {
				printBox(size); 
			}
			
			//printDiamond
			if (menuSelect == 2) {
				printDiamond(size); 
			}
			
			//printX
			if (menuSelect == 3) {
				printX(size); 
			}
			
			//Quit Program
			if (menuSelect == 4) {
				hasNotQuit = false; 
				System.out.println("Good bye!");
			}
		}
		
		//printMenu method
		private static void printMenu() {
			System.out.println("MENU");
			System.out.println("1. Print box");
			System.out.println("2. Print diamond"); 
			System.out.println("3. Print X"); 
			System.out.println("4. Quit program"); 
			System.out.println("Please select an option: "); 
		}
		
	}
	
	//Close scanner
	scan.close(); 

}
