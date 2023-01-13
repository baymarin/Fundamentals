package Fundamentals.AssociativeArray;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i].toLowerCase(Locale.ROOT);
            if (!linkedHashMap.containsKey(currentWord)) {
                linkedHashMap.put(currentWord, 0);
            }
            linkedHashMap.put(currentWord, linkedHashMap.get(currentWord) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
