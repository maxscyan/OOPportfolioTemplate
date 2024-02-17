import java.util.Scanner;
public class Reverser {
    public static void main(String[] args){
        String input, reversed = "";
        char chr;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string to be reversed: ");
        input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            chr = input.charAt(i);
            reversed = chr + reversed; }
    
        System.out.println("Word: " + reversed);
    }
}
