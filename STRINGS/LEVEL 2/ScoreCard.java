import java.util.Random;

public class ScoreCard{
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 10;

        System.out.println("StuNo  Phy  Chem  Math  Total  Avg   %   Grade");

        for (int i = 1; i <= students; i++) {
            int phy = 10 + rand.nextInt(90);
            int chem = 10 + rand.nextInt(90);
            int math = 10 + rand.nextInt(90);

            int total = phy + chem + math;
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            String grade;
            if (perc >= 80) grade = "A";
            else if (perc >= 70) grade = "B";
            else if (perc >= 60) grade = "C";
            else if (perc >= 50) grade = "D";
            else if (perc >= 40) grade = "E";
            else grade = "R";

            System.out.printf("%-6d %-4d %-5d %-5d %-6d %-5.1f %-5.1f %-2s\n",
                              i, phy, chem, math, total, avg, perc, grade);
        }
    }
}
