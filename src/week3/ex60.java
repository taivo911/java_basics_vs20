package week3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex60 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
        }

        Collections.sort(words);

        System.out.println("You typed the following words:");
        for (String word : words
        ) {
            System.out.println(word);
        }

    }
}