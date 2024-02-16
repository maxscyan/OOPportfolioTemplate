// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay;    // User's play -- "R", "P", or "S"
        String computerPlay = "";  // Computer's play -- "R", "P", or "S"
        int computerInt;      // Randomly generated number used to determine
        // computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Get player's play -- note that this is stored as a string
        // Make player's play uppercase for ease of comparison
        // Generate computer's play (0,1,2)
        // Translate computer's randomly generated play to string
        System.out.println("Please enter your play: 'R', 'P', or 'S'.");
        personPlay = scan.nextLine().toUpperCase();

        computerInt = generator.nextInt(3) + 1;

        switch (computerInt) {
            case 1:
                computerPlay = "R";
                break;
            case 2:
                computerPlay = "P";
                break;
            case 3:
                computerPlay = "S";
                break;
            default:
                System.out.println("Invalid");
        }

        // Print computer's play
        System.out.println("Computer's play: " + computerPlay);

        // See who won. Use nested ifs instead of &&
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper covers rock. Computer wins");
            else if (personPlay.equals("P"))
                if (computerPlay.equals("R"))
                    System.out.println("Paper covers rock. You win!!");
                else if (computerPlay.equals("S"))
                    System.out.println("Scissors cut paper. Computer wins");
                else if (personPlay.equals("S"))
                    if (computerPlay.equals("P"))
                        System.out.println("Scissors cut paper. You win!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Rock crushes scissors. Computer wins");
    }
}
