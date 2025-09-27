import java.util.Scanner;

public class UpperCaseDemo {
    static String toUpperCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String custom = toUpperCustom(text);
        String builtIn = text.toUpperCase();
        System.out.println("Equal? " + compareStrings(custom, builtIn));
    }
}
