/* Sebastian Rincon
 * COSC-2436 2801
 * 09/04/2021
 * Hello World Java
 */

// GUI tools import
import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        // Initiating Variables
        String userName = "";
        double weeklySalary = 0.0;
        // Prompt for user name & Setting response to userName variable
        userName = JOptionPane.showInputDialog("Hello, what is your name? ");
        // Prompt for weekly salary & setting the response to weeklySalary variable
        weeklySalary = Double.parseDouble(JOptionPane.showInputDialog("What is your weekly salary?: "));
        // Updating salary with new value
        weeklySalary += 50;
        // Displaying message with new salary
        JOptionPane.showMessageDialog(null, "Thank you, " + userName
                + " we will increase your weekly salary by 50 dollars. Your new weekly salary is: $" + weeklySalary);

    }
}
