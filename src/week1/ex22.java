package week1;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i<3; i++) {
            System.out.print("Type the password: ");
            String typedPassword = reader.nextLine();
            System.out.println(typedPassword);
            if (typedPassword.equals("secret")) {
                System.out.println("Password correct!\nThis is the secret area!");
                break;
            } else {
                System.out.println("Wrong password!");
            }


        }

    }
}
