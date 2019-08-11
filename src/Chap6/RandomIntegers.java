package Chap6;
// Random number examples

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            int face = 1 +  randomNum.nextInt(6);

            System.out.printf("%d ", face);

            // New line
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
