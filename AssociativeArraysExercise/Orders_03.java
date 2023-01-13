package Fundamentals.AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<Double>> map = new LinkedHashMap<>();


        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);
            if (map.containsKey(product)) {
                double currentQty = map.get(product).get(1);
                currentQty += quantity;
                map.get(product).set(1, currentQty);
                map.get(product).set(0, price);

            } else {
                map.put(product, new ArrayList<>());
                map.get(product).add(price);
                map.get(product).add(quantity);
            }


            input = scanner.nextLine();
        }
        for (String entry : map.keySet()) {
            System.out.printf("%s -> %.2f%n", entry, totalPrice(map.get(entry)));
        }
    }

    public static double totalPrice(List<Double> list) {
        double price = list.get(0);
        double qty = list.get(1);
        return price * qty;
    }
}
