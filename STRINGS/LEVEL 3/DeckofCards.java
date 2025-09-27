import java.util.Scanner;

public class DealCardsSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};

        // make deck
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        System.out.print("Enter number of participants: ");
        int participants = sc.nextInt();

        System.out.print("Enter number of cards per participant: ");
        int cardsEach = sc.nextInt();

        int total = participants * cardsEach;
        if (total > 52) {
            System.out.println("Not enough cards in deck!");
        } else {
            int cardIndex = 0;
            for (int p = 1; p <= participants; p++) {
                System.out.println("Player " + p + ":");
                for (int c = 1; c <= cardsEach; c++) {
                    System.out.println("  " + deck[cardIndex]);
                    cardIndex++;
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
