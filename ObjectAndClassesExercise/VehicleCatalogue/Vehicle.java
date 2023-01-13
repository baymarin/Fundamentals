package Fundamentals.ObjectAndClassesExercise.VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepower;

    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle,
                   int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return this.modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return this.colorOfVehicle;
    }

    public int getHorsepower() {
        return this.horsepower;
    }
    public String toString (){
        String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepower);
    return result;
    }
}
