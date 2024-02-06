import java.util.Scanner;
public class TaskFive {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int den, num;
    System.out.println("Please enter a numerator: ");
    num = scan.nextInt();
    System.out.println("Please enter a denominator: ");
    den = scan.nextInt();
    double decimal = (double) num / den;
    System.out.println(decimal);
    }
}
