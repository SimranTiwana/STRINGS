import java.util.Scanner;

public class CompareStrings {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        boolean customResult = compareStrings(str1, str2);
        System.out.println("Comparison using charAt(): " + customResult);

        boolean builtInResult = str1.equals(str2);
        System.out.println("Comparison using equals(): " + builtInResult);

        sc.close();
    }
}
