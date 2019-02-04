package Chap4;

public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); //5
        System.out.printf("postincrementing c: %d%n", c++); //5
        System.out.printf("c after postincrement: %d%n", c); //6

        System.out.println();

        c = 5;
        System.out.printf("c before preincrement: %d%n", c); //5
        System.out.printf("preincrementing c: %d%n", ++c); //g
        System.out.printf("c after preincrement: %d%n", c); //6
    }
}
