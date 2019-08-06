package Chap4;

/*  The explosive growth of Internet communications and data storage on Internet-connected computers has greatly increased privacy concerns. The field of cryptography is concerned with coding data to make it difficult (and hopefully—with the most advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet has asked you to write a program that will encrypt it so that it may be transmitted more securely. All the data is transmitted as four-digit integers. Your application should read a four-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the encryption scheme) to form the original number. [Optional reading project: Research “public key cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may also want to investigate the RSA scheme, which is widely used in industrial-strength applications.] */

import java.util.Scanner;

public class EncryptionExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input 4 digit number");
        int preEncryption = input.nextInt();

        encrypt(preEncryption);

    }

    public static int encrypt(int source) {
        int result = 0;

        int digit1 = source/1000;
        source = source%1000;

        int digit2 = source/100;
        source = source%100;

        int digit3 = source/10;
        source = source%10;

        int digit4 = source;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4);

        digit1 = (digit1+7)%10;
        digit2 = (digit2+7)%10;
        digit3 = (digit3+7)%10;
        digit4 = (digit4+7)%10;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4);

        result = result+(digit3*1000)+(digit1*100)+(digit4*10)+digit2;

        System.out.println(result);

        return result;
    }
}
