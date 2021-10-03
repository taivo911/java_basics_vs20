package week2;

import java.util.Scanner;

public class ex37 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int countAll = 0;
        int countEven = 0;
        int countOdd = 0;
        double average = 0.0;
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            countAll++;

            if(number % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
            sum += number;
            average = (double)sum / countAll;
        }
        System.out.println("Sum : " + sum);
        System.out.println("Numbers: " + countAll);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
        System.out.println("AVG: " + average);
        printText();
    }

    public static void printText() {
        // write your code here
        System.out.println("Hello hello!.");
    }
}