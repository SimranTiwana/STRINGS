import java.util.Scanner;

public class SubstringExample {
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();

        String sub1 = customSubstring(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println("Custom substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are they equal? " + compareStrings(sub1, sub2));

        sc.close();
    }
}
