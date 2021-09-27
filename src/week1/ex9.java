package week1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Answer is: " + firstNumber + "/" + secondNumber + "=" + (double)firstNumber/secondNumber);

        System.out.println("Goodbye");

    }

}
