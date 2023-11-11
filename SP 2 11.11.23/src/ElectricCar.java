
public class ElectricCar extends ACar {
    private final double batteryCapacityKWh;
    private final double maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacityKWh, double maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public double getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public double getMaxRangeKm() {
        return maxRangeKm;
    }

    public double getWhPrKm() {
        return batteryCapacityKWh / maxRangeKm;
    }

    @Override
    public int getRegistrationFee() {
        final double batteryCapacityConversion  = getWhPrKm() / 91.25 / 100;
        final int registrationFee;

        if(batteryCapacityConversion <= 50 && batteryCapacityConversion >= 20) {
            return registrationFee = 330;

        } else if(batteryCapacityConversion >= 15 && batteryCapacityConversion <= 20) {
            return registrationFee = 1050;

        } else if(batteryCapacityConversion  >= 5 && batteryCapacityConversion <= 10) {
            return registrationFee = 5500;

        } else if(batteryCapacityConversion <5){
            return registrationFee = 10470;

        } else {
            return registrationFee = 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Battery Capacity: " + getBatteryCapacityKWh() +
                " KWh, Max Range: " + getMaxRangeKm() + " Km, Registration Fee: " + getRegistrationFee();
    }
}