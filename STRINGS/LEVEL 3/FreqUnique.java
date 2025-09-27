import java.util.Scanner;

public class CharFrequencyUnique {

    static void findFrequency(String text) {
        String unique = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean alreadySeen = false;

            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == c) {
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen) {
                unique = unique + c;
            }
        }

        for (int i = 0; i < unique.length(); i++) {
            char u = unique.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == u) {
                    count++;
                }
            }

            System.out.println(u + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        findFrequency(text);
    }
}
