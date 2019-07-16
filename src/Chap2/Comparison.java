package Chap2;

//Compare Integers
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first Integer:");
        int num1 = input.nextInt();

        System.out.println("Input second Integer:");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.printf("%d == %d%n", num1, num2);
        }

        if (num1 != num2) {
            System.out.printf("%d != %d%n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d < %d%n", num1, num2);
        }

        if (num1 > num2) {
            System.out.printf("%d > %d%n", num1, num2);
        }

        if (num1 <= num2) {
            System.out.printf("%d <= %d%n", num1, num2);
        }

        if (num1 >= num2) {
            System.out.printf("%d >= %d%n", num1, num2);
        }


    }
}
