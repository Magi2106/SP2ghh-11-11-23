
public class DieselCar extends AFuelCar {
    private final int kmPerLitre;
    private final boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
        this.hasParticleFilter = hasParticleFilter;
    }

    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public int getRegistrationFee() {
        final int registrationFee;
        final int dieselFee;

        if (kmPerLitre <= 50 && kmPerLitre >= 20) {
            dieselFee = 130;
            return registrationFee = 330 + dieselFee;

        } else if (kmPerLitre >= 15 && kmPerLitre <= 20) {
            dieselFee = 1390;
            return registrationFee = 1050 + dieselFee;

        } else if (kmPerLitre >= 10 && kmPerLitre <= 15) {
            dieselFee = 1850;
            return registrationFee = 5500 + dieselFee;

        } else if (kmPerLitre >= 5 && kmPerLitre <= 10) {
            dieselFee = 2770;
            return registrationFee = 5500+ dieselFee;

        } else if (kmPerLitre < 5) {
            dieselFee = 15260;
            return registrationFee = 10470 + dieselFee;

        } else {
            return registrationFee = 0;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Fuel Type: " + getFuelType() + ", Registration Fee: " + getRegistrationFee() +
                ", Particle Filter: " + (hasParticleFilter ? "Yes" : "No");
    }
}