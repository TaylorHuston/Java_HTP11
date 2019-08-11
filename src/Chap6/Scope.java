package Chap6;
// Scope examples

public class Scope {
    private static int x = 1;  //Static field

    public static void main(String[] args) {
        int x = 5;  //Local variable

        System.out.printf("Local x in main is %d%n" , x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("Local x in main is %d%n" , x);
    }

    public static void useLocalVariable() {
        int x = 25;  //Initialized anytime method is called

        System.out.printf("%nLocal x on entering useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("Local x on exiting useLocalVariable is %d%n", x);
    }

    public static void useField() {
        System.out.printf("%nField x on entering useField is %d%n", x);
        x *= 10;
        System.out.printf("Field x on exiting useField is %d%n", x);
    }

}
