/* Sebastian Rincon
 * COSC-2436 2801
 * 08/31/2021
 * Hello World Java
 */

// Importing Scanner
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Printing question to terminal
        System.out.print("Hello, what is your name? ");
        // Creating Scanner object
        Scanner input = new Scanner(System.in);
        // Setting the next input as userName
        String userName = input.nextLine();
        // Printing another question
        System.out.print("Nice to meet you, what is your weekly salary? ");
        // Setting response as userSalary
        int userSalary = input.nextInt();
        // Priting statment and setting new value to salary
        System.out.printf(
                "Thank you %s, we will increase your weekly salary by 50 dollars. Your new weekly salary is: $%d \n",
                userName, (userSalary += 50));

    }
}
