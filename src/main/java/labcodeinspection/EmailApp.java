package labcodeinspection;

import java.util.Scanner;

/**
 * dasdas
 * comments.
 */

public final class EmailApp { 
	
	  private EmailApp() {
	        throw new UnsupportedOperationException();
	    }

	  /**
	   * comentario xd
	   * comments.
	   */
	public static void main(final String args[] ) {
		
		final Scanner scLong = new Scanner(System.in); 
		
try {
		System.out.print("Enter your first name: "); //NOPMD
		final String firstName = scLong.nextLine();

		System.out.print("Enter your last name: ");//NOPMD
		 final String lastName = scLong.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: "); //NOPMD

		final int depChoice = scLong.nextInt();


		

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	
}
	finally {
		
		scLong.close(); 
	}
	
		
		
	}
	
}
