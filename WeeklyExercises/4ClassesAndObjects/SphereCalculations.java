import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SphereCalculations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the radius of the sphere:");
        double radius = scan.nextDouble();
        double volume, surfaceArea, radiCubed, radiSquared;

        radiSquared = Math.pow(radius, 2);
        radiCubed = Math.pow(radius, 3);

        volume = (4 * Math.PI * radiCubed) / 3;
        surfaceArea = 4 * Math.PI * radiSquared;

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("Volume = " + df.format(volume));
        System.out.println("Surface Area = " + df.format(surfaceArea));
    }
}
