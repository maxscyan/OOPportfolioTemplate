public class Punctuation {
    public static void main(String[] args) {
        String mary = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ";
        String punctuation = ".,!?;:-()[]";

        int[] punctuationCounts = new int[punctuation.length()];

        for (char c : mary.toCharArray()) {
            int index = punctuation.indexOf(c);
            if (index != -1) {
                punctuationCounts[index]++;
            }
        }
        System.out.println("Punctuation Mark\tCount");
        System.out.println("----------------\t-----");
        for (int i = 0; i < punctuation.length(); i++) {
            System.out.println(punctuation.charAt(i) + "\t\t\t\t\t" + punctuationCounts[i]);
        }
    }
}
