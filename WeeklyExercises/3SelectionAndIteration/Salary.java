import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args) {
        double currentSalary;  // employee's current salary
        double raise = 0.0;    // amount of the raise, initialize to a default value
        double newSalary;      // new salary for the employee
        String rating;         // performance rating

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();

        // Compute the raise using a switch statement
        switch (rating) {
            case "Excellent":
                raise = currentSalary * 0.06;  // 6% raise
                break;
            case "Good":
                raise = currentSalary * 0.04;  // 4% raise
                break;
            case "Poor":
                raise = currentSalary * 0.015; // 1.5% raise
                break;
            default:
                System.out.println("Invalid performance rating. No raise calculated.");
        }

        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));
        System.out.println();
    }
}
