package Chap7;
//Example of a 2D array

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        outputArray(array2);
    }


    public static void outputArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);
            }

            System.out.println();
        }
    }
}