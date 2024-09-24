import java.text.DecimalFormat;

public class Car {
    private CarType carType;
    private String interiorMaterial;
    private String soundSystem;
    private String safetyPackage;
    private double totalPrice;

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setInteriorMaterial(String interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void setSafetyPackage(String safetyPackage) {
        this.safetyPackage = safetyPackage;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Add getter methods for the builder
    public CarType getCarType() {
        return carType;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public String getSoundSystem() {
        return soundSystem;
    }

    public String getSafetyPackage() {
        return safetyPackage;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Car Customization:\n" +
                "Car Type: " + carType + "\n" +
                "Interior Material: " + interiorMaterial + "\n" +
                "Sound System: " + soundSystem + "\n" +
                "Safety Package: " + safetyPackage + "\n" +
                "Total Price: $" + df.format(totalPrice) + "\n";
    }
}
