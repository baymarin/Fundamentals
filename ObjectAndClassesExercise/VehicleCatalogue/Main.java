package Fundamentals.ObjectAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] vehicle = input.split(" ");
            String type = vehicle[0];
            String model = vehicle[1];
            String color = vehicle[2];
            int horsepower = Integer.parseInt(vehicle[3]);
            Vehicle vehicle1;
            if (type.equals("car")) {
                vehicle1 = new Vehicle("Car", model, color, horsepower);
                vehicles.add(vehicle1);
            } else {
                vehicle1 = new Vehicle("Truck", model, color, horsepower);
                vehicles.add(vehicle1);
            }

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModelOfVehicle().equals(command)) {
                    System.out.println(vehicle.toString());
                }
            }
        command = scanner.nextLine();
        }
        double carHorsePower = getHorsePower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHorsePower));
        double truckHorsePower = getHorsePower(vehicles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHorsePower));
    }

    private static double getHorsePower(ArrayList<Vehicle> vehicles, String type) {
        double sum = 0.0;
        int counter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfVehicle().equals(type)) {
                sum += vehicle.getHorsepower();
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}

