package Chap7;
//Example of passing in args from command line

public class InitArrayArgs {
    public static void main(String[] args) {
        //Check number of command line args
        if (args.length != 3) {
            System.out.println("Wrong!");
        } else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialVal = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int i = 0; i < array.length; i++) {
                array[i] = initialVal + increment * i;
            }
            System.out.printf("%s%8s%n", "Index", "Value");

            for (int i = 0; i < array.length; i++) {
                System.out.printf("%5d%8d%n", i, array[i]);
            }
        }
    }

}
