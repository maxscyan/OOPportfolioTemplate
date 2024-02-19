import java.util.Random;

public class PinEncryption {
    public static void main (String[] args) {
        Random rand = new Random();

        int Pin = 1234, NumOne, NumTwo;

        NumOne = rand.nextInt(1000, 65536);
        NumTwo = rand.nextInt(1000, 65536);

        String HexPin = Integer.toHexString(Pin), HexOne = Integer.toHexString(NumOne), HexTwo = Integer.toHexString(NumTwo), Output;

        Output = HexOne.concat(HexPin).concat(HexTwo);
        System.out.println(Output);

    }
}
