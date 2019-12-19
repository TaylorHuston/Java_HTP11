package Chap5;
// Counter-controlled iteration with while loop

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {
            System.out.printf("%d ", counter);
            ++counter;
        }

        System.out.println();
    }
}
