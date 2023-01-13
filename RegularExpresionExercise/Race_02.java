package Fundamentals.RegularExpresionExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        LinkedHashMap<String, Integer> namesMap = new LinkedHashMap<>();
        String letterRegex = "[A-Za-z]";
        String numbersRegex = "[0-9]";
        Pattern letterPatter = Pattern.compile(letterRegex);
        Pattern numbersPatter = Pattern.compile(numbersRegex);
        for (String name : names) {
            namesMap.put(name, 0);
        }
        String command = scanner.nextLine();
        while (!command.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            int distance = 0;
            Matcher letterMatcher = letterPatter.matcher(command);
            Matcher digitMatcher = numbersPatter.matcher(command);
            while (letterMatcher.find()) {
                nameBuilder.append(letterMatcher.group());
            }
            while (digitMatcher.find()) {
                distance += Integer.parseInt(digitMatcher.group());
            }
            if (namesMap.containsKey(nameBuilder.toString())) {
                int currentDistance = namesMap.get(nameBuilder.toString());
                namesMap.put(nameBuilder.toString(), distance += currentDistance);
            }
            command = scanner.nextLine();
        }

        List<String> top3Racers = namesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + top3Racers.get(0));
        System.out.println("2nd place: " + top3Racers.get(1));
        System.out.println("3rd place: " + top3Racers.get(2));
    }
}
