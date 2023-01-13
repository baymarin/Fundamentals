package Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String[] lastArrayIndex = input[input.length - 1].split("\\.");
        String name = lastArrayIndex[0];
        String extension = lastArrayIndex[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
