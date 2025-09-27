import java.util.Scanner;

public class StringLength {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int len1 = findLength(str);
        int len2 = str.length();
        System.out.println("User defined length: " + len1);
        System.out.println("Built-in length: " + len2);
    }
}
