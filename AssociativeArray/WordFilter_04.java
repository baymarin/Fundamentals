package Fundamentals.AssociativeArray;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() % 2 == 0)
                .toArray(String[] :: new);
        for (String s : input) {
            System.out.println(s);

        }


//        for (int i = 0; i < input.length; i++) {
//            String currentWord = input[i];
//            if (currentWord.length() % 2 == 0){
//                System.out.printf("%s%n", currentWord);
//            }
//        }
    }
}
