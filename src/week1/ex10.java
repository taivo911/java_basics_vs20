package week1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = radius*Math.PI*2;

        System.out.println("Circle circumference: " + circumference);

    }
}
