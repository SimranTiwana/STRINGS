import java.util.Scanner;

public class RockPaperScissors{

    static String getComputerChoice() {
        int n = (int) (Math.random() * 3);
        if (n == 0) return "rock";
        else if (n == 1) return "paper";
        else return "scissors";
    }

    static int playRound(String player, String computer) {
        if (player.equals(computer)) return 0;
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games:");
        int games = sc.nextInt();
        sc.nextLine();

        int playerWin = 0;
        int computerWin = 0;
        int tie = 0;

        for (int i = 1; i <= games; i++) {
            System.out.println("Game " + i + " - Enter rock, paper, or scissors:");
            String playerChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            int result = playRound(playerChoice, computerChoice);
            if (result == 1) {
                System.out.println("Player wins this round!");
                playerWin++;
            } else if (result == -1) {
                System.out.println("Computer wins this round!");
                computerWin++;
            } else {
                System.out.println("This round is a tie!");
                tie++;
            }
            System.out.println();
        }

        System.out.println("Game Stats:");
        System.out.println("Player Wins\tComputer Wins\tTies");
        System.out.println(playerWin + "\t\t" + computerWin + "\t\t" + tie);

        int total = games;
        System.out.println("Winning Percentage:");
        System.out.println("Player: " + (playerWin * 100 / total) + "%");
        System.out.println("Computer: " + (computerWin * 100 / total) + "%");
        System.out.println("Ties: " + (tie * 100 / total) + "%");
    }
}
