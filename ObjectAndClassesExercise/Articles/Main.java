package Fundamentals.ObjectAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        Article article = new Article(input[0], input[1], input[2]);
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ", 2);
            switch (command[0]) {
                case "Edit:":
                    article.setContent(command[1]);
                    break;
                case "ChangeAuthor:":
                    article.setAuthor(command[1]);
                    break;
                case "Rename:":
                    article.setTitle(command[1]);
                    break;
            }
        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
