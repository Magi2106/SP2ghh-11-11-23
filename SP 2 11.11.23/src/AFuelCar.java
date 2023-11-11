
public abstract class AFuelCar extends ACar {
    protected int kmPerLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }

    public abstract String getFuelType();

    public int kmPrLitre() {
        return kmPerLitre;
    }

    @Override
    public String getModel() {
        return model;
    }
}
