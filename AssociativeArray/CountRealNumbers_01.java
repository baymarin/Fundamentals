package Fundamentals.AssociativeArray;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> mapArr = new TreeMap<>();
        for (Double number : inputArr) {
            if (!mapArr.containsKey(number)) {
                mapArr.put(number, 0);
            }
            mapArr.put(number, mapArr.get(number) + 1);
        }
        for (Map.Entry<Double, Integer> entry : mapArr.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
