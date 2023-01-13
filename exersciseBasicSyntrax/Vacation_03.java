package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountPpl = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        switch (type) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = price * amountPpl;
        if (type.equals("Students") && amountPpl >= 30) {
            totalPrice *= 0.85;
        }
        if (type.equals("Business") && amountPpl >= 100){
            totalPrice = (amountPpl - 10) * price;
        }
        if (type.equals("Regular") && amountPpl >= 10 && amountPpl <= 20){
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
