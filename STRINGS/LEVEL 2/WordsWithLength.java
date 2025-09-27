import java.util.Scanner;

public class WordsWithLength {
    static String[] customSplit(String s) {
        int count = 1;
        for (int i = 0;; i++) {
            try { if (s.charAt(i) == ' ') count++; }
            catch (Exception e) { break; }
        }
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0;; i++) {
            try {
                if (s.charAt(i) == ' ') {
                    words[idx++] = s.substring(start, i);
                    start = i + 1;
                }
            } catch (Exception e) {
                words[idx] = s.substring(start);
                break;
            }
        }
        return words;
    }

    static int findLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } }
        catch (Exception e) {}
        return count;
    }

    static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = customSplit(s);
        String[][] result = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
    }
}
