import java.util.Scanner;

public class ShortLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String word = "";
        String shortest = "";
        String longest = "";

        for (int i = 0; i <= text.length(); i++) {
            char ch = i < text.length() ? text.charAt(i) : ' ';
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    if (shortest.equals("") || word.length() < shortest.length()) {
                        shortest = word;
                    }
                    if (longest.equals("") || word.length() > longest.length()) {
                        longest = word;
                    }
                    word = "";
                }
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
