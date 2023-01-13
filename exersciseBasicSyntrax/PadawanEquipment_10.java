package Fundamentals.exersciseBasicSyntrax;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double priceSabers = priceSaber * Math.ceil(countStudents * 1.1);
        double priceRobes = priceRobe * countStudents;
        int freeBelts = countStudents / 6;
        double priceBelts = (priceBelt * countStudents) - (freeBelts * priceBelt);
        double totalSum = priceBelts + priceRobes + priceSabers;
        if (totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - budget);
        }

    }
}
