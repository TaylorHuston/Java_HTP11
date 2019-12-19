package Chap7;
//Basic array examples

public class InitArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value"); //Headings


        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }

        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%s%8s%n", "Index", "Value"); //Headings

        for (int counter = 0; counter < array2.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array2[counter]);
        }

        int[] array3 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int counter = 0; counter < array2.length; counter++) {
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
