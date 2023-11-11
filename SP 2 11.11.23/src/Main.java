public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();


        Car gasolineCar1 = new GasolineCar("ABC1532523", "Audi", "A8", 2, 15);
        Car dieselCar1 = new DieselCar("Dga443234256", "BMW", "X15", 4, 26, true);
        Car electricCar1 = new ElectricCar("GHIgaaa721312389", "Tesla", "Model 22223", 2, 105, 700);

        fleet.addCarToFlotilla(gasolineCar1);
        fleet.addCarToFlotilla(dieselCar1);
        fleet.addCarToFlotilla(electricCar1);

        System.out.println( fleet.getTotalRegistrationFeeForFleet() + " kr");
    }
}
