import java.util.Scanner;
public class TaskFour {
    public static void main (String[] args){
        int side;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of a square's side: ");
        side = scan.nextInt();
        int perm = side * 4;
        int area = side * side;
        System.out.println(perm + " is the perimeter. " + area + " is the area.");
    }
}

