package Chap6;
// Example of method with multiple parameters
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating point numbers divided by spaces ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1, num2, num3);

        System.out.printf("Maximum is: %f", result);
    }

    public static double maximum(double x, double y, double z) {
        double max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }
}
