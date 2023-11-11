import java.util.ArrayList;


public class FleetOfCars {
    private final ArrayList<Car> carFleet;

    public FleetOfCars() {
        this.carFleet = new ArrayList<>();
    }

    public void addCarToFlotilla(Car car) {
        carFleet.add(car);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Car Fleet:\n");

        for (Car car : carFleet) {
            result.append(car.toString()).append("\n");
        }

        return result.toString();
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;

        for (Car car : carFleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }

        return totalRegistrationFee;
    }
}