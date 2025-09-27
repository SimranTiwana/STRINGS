import java.util.Scanner;

public class SplitCompareSimple {

    // Custom split using simple concatenation
    static String customSplitAndCompare(String s) {
        String word = "";
        String allWords = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                allWords += word + "|"; // separate words with |
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        allWords += word; // add last word
        return allWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        String custom = customSplitAndCompare(s);
        String normal = s.replace(" ", "|"); // simulating split

        if (custom.equals(normal)) {
            System.out.println("Both are equal!");
        } else {
            System.out.println("Both are not equal!");
        }
    }
}
