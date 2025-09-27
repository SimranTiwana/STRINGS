import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println(num);
    }

    static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        //generateException(text);  // Uncomment to crash
        handleException(text);
    }
}
