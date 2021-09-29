package week2;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert numbers: ");
            int sum = 0;
            while (true) {
                int read = Integer.parseInt(reader.nextLine());
                if (read == 0) {
                    break;
                }

                sum = sum + read; // sum += read;

                System.out.println("Sum now: " + sum);
            }

            System.out.println("Sum in the end: " + sum);
        }
    }



