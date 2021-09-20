/*
Sebatian Rincon
COSC-2436 2801
09/19/2021
Palindrome
 */

// import for Scanner and swing GUI
import java.util.*;
import javax.swing.*;

public class Palindrome {
	// Helper method that calls isPalindrome with the string and a set of min-max indexes
	public static boolean isPalindrome(String testString) {
		return isPalindrome(testString.toLowerCase(), 0, testString.length()-1);
	}
	
	public static boolean isPalindrome(String testString, int low, int high){
		// Base case checking if the indexes have crossed yet
		// if they have crossed then the method passes true
		if (high <= low){ 
			return true; 
		}
		// checking if the chars across from each other are the same
		// if not then the method passes false
		else if (testString.charAt(low) != testString.charAt(high)){ // Base case
			return false;
		}
		// finally if the indexes have not crossed and
		// the chars across from one another are the same
		// rerun the method moving the indexed closer to the center
		else {
			return isPalindrome(testString, low+1, high-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// GUI output and string input assigned to userInput		 
		String userInput = JOptionPane.showInputDialog("Please enter a word or phrase to determine if it is a Palindrome: ");    
		// calling the method with the userInput 
		// if true printing message
		if (isPalindrome(userInput)) {
			JOptionPane.showMessageDialog(null,"Thank you, your word "+ userInput + " is a Palindrome.");
		}
		// if not true printing message
		else {
			JOptionPane.showMessageDialog(null,"Thank you, your word "+ userInput + " is not a Palindrome.");
		}
		// closing scanner
		input.close();

		
	}

}
