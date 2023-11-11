
public class GasolineCar extends AFuelCar {
    private final int kmPerLitre;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }

    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        final int registrationFee;

        if(kmPerLitre <= 50 && kmPerLitre >= 20) {
            return registrationFee = 330;
        } else if(kmPerLitre >= 15 && kmPerLitre <= 20) {
            return registrationFee = 1050;

        } else if(kmPerLitre  >= 5 && kmPerLitre <= 10) {
            return registrationFee = 5500;
        } else if(kmPerLitre <5){
            return registrationFee = 10470;
        } else {
            return registrationFee = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Type: " + getFuelType() + ", Registration Fee: " + getRegistrationFee();
    }
}