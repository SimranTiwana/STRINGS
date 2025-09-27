import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char lower = Character.toLowerCase(ch);

            if (lower >= 'a' && lower <= 'z') {
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    System.out.println(ch + " is a Vowel");
                } else {
                    System.out.println(ch + " is a Consonant");
                }
            } else {
                System.out.println(ch + " is Not a Letter");
            }
        }
    }
}
