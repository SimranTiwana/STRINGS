import java.util.Scanner;

public class StringCharCompareNoArray {

    static void printChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
    }

    static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.print("Characters from method: ");
        printChars(text);

        System.out.print("Characters from toCharArray(): ");
        for (char c : text.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        boolean result = compareStrings(text, text);
        if (result) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
