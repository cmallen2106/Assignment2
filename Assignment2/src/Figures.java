//Assignment 2 - Figures
//Christina Sosa
//Programming Fundamentals, Summer 2021

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
			System.out.println("Renter the size of the figure: "); 
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
		
		//close scanner
		scan.close();
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
		
		//printBox method
		public static void printBox(int size) {
			for (int row = 1; row <= size; row++) {
				for(int col = 1; col <= size; col++) {
				System.out.print("X");
				}
				System.out.println();
			}
		}
		
		public static void printDiamond(int size){
		
			//Shape will be executed in a top and bottom half
		
			{ 
		        int i, j, k = 0; 
		      
		       //top half diamond
		        for (i = 1; i <= size; i++) { 
		      
		            for (j = 1; j <= size - i; j++) { 
		                System.out.print(" "); 
		            } 
		      
		            while (k != (2 * i - 1)) { 
		                if (k == 0 || k == 2 * i - 2) 
		                    System.out.print("X"); 
		                else
		                    System.out.print(" "); 
		                k++; 
		            } 
		            k = 0; 
		      
		            System.out.println(); 
		        } 
		        
		        size--; 
		      
		        // bottom half diamond
		        for (i = size; i >= 1; i--) { 
		      
		            for (j = 0; j <= size - i; j++) { 
		                System.out.print(" "); 
		            } 
		      
		            k = 0; 
		            while (k != (2 * i - 1)) { 
		                if (k == 0 || k == 2 * i - 2) 
		                    System.out.print("X"); 
		                else
		                    System.out.print(" "); 
		                k++; 
		            } 
		            System.out.println(); 
		        } 
		    } 

}
		
		private static void printX(int size)
		//Split into 3 sections to make the X
		{
		    System.out.println();
		    
	        // top have of X
	        int bigSpace = size - 2;
	        int startSpace = 0;
	      
	        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
	          
	        	for (int space = 1; space <= startSpace; space++)
	                System.out.print(" ");
	            	System.out.print("X");
	            
	            for (int space = 1; space <= bigSpace; space++) {
	                System.out.print(" ");
	            }
	            System.out.print("X");
	            System.out.println();
	            
	            bigSpace -= 2;
	            startSpace += 1;
	        }
	        
	        // middle section of X
	        for (int space = 1; space <= startSpace; space++)
	            System.out.print(" ");
	        	System.out.println("X");
	        	bigSpace = 1;

	        // bottom section of X
	        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
	            startSpace -= 1;
	            
	            for (int space = 1; space <= startSpace; space++)
	                System.out.print(" ");
	            System.out.print("X");
	            
	            for (int space = 1; space <= bigSpace; space++) {
	                System.out.print(" ");
	            }
	            
	            System.out.print("X");
	            System.out.println();
	            bigSpace += 2;
		}
		
	   }
	}