import java.util.Scanner;

public class BMIProgramSimple {

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    static double computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    static void display(double weight, double height, double bmi, String status) {
        System.out.println("Weight: " + weight + " kg, Height: " + height + " cm, BMI: " + bmi + ", Status: " + status);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight(kg) for person " + i + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + i + ": ");
            double height = sc.nextDouble();

            double bmi = computeBMI(weight, height);
            String status = getStatus(bmi);

            display(weight, height, bmi, status);
        }
    }
}
