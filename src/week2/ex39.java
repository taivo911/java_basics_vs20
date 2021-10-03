package week2;

import java.util.Scanner;

public class ex39 {

    public static void printText() {
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
            i++;
            printText();
        }
    }
}
