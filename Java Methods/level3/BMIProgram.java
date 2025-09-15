
import java.util.Scanner;

public class BMIProgram {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i+1) + ": ");
            double height = sc.nextDouble();
            double bmi = calculateBMI(weight, height);
            data[i][0] = weight; data[i][1] = height; data[i][2] = bmi;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i+1) + " - Weight: " + data[i][0] + ", Height: " + data[i][1] + ", BMI: " + data[i][2] + ", Status: " + getStatus(data[i][2]));
        }
    }
}
