import java.util.Scanner;
public class TaskThree {

    public static void main(String[] args)
    {
        float kilometers;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value in miles: ");
        float miles = scan.nextFloat();
        kilometers = miles * (float)1.60935;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}
