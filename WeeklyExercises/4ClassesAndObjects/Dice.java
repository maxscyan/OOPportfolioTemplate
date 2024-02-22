import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main (String[] args) {
        int sidesOne, sidesTwo;
        int sumOne = 0, sumTwo = 0, randNumberOne, randNumberTwo;


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many sides does die 1 have?");
        sidesOne = scan.nextInt();

        System.out.println("How many sides does die 2 have?");
        sidesTwo = scan.nextInt();

        for (int i = 0; i < 3; i++) {
            randNumberOne = rand.nextInt(sidesOne) + 1;
            randNumberTwo = rand.nextInt(sidesTwo) + 1;

            System.out.println("Die 1 roll " + (i + 1) + ": " + randNumberOne);
            System.out.println("Die 2 roll " + (i + 1) + ": " + randNumberTwo);

            sumOne += randNumberOne;
            sumTwo += randNumberTwo;
        }

        double averageOne = (double) sumOne/ 3;
        double averageTwo = (double) sumTwo / 3;

        System.out.println("Die one rolled a total of " + sumOne + " and rolled a " + averageOne + " on average.");
        System.out.println("Die one rolled a total of " + sumTwo + " and rolled a " + averageTwo + " on average. ");
    }
}
