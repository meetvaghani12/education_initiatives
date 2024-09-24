public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder setCarType(CarType carType) {
        car.setCarType(carType);
        return this;
    }

    public CarBuilder setInteriorMaterial(String interiorMaterial) throws InvalidOptionException {
        if (!interiorMaterial.equalsIgnoreCase("leather") &&
            !interiorMaterial.equalsIgnoreCase("fabric")) {
            throw new InvalidOptionException("Invalid interior material: " + interiorMaterial);
        }
        car.setInteriorMaterial(interiorMaterial);
        return this;
    }

    public CarBuilder setSoundSystem(String soundSystem) throws InvalidOptionException {
        if (!soundSystem.equalsIgnoreCase("basic") &&
            !soundSystem.equalsIgnoreCase("premium") &&
            !soundSystem.equalsIgnoreCase("surround")) {
            throw new InvalidOptionException("Invalid sound system: " + soundSystem);
        }
        car.setSoundSystem(soundSystem);
        return this;
    }

    public CarBuilder setSafetyPackage(String safetyPackage) throws InvalidOptionException {
        if (!safetyPackage.equalsIgnoreCase("standard") &&
            !safetyPackage.equalsIgnoreCase("advanced") &&
            !safetyPackage.equalsIgnoreCase("full")) {
            throw new InvalidOptionException("Invalid safety package: " + safetyPackage);
        }
        car.setSafetyPackage(safetyPackage);
        return this;
    }

    public CarBuilder calculateTotalPrice() {
        double price = OptionPrice.getInteriorPrice(car.getInteriorMaterial()) +
                       OptionPrice.getSoundSystemPrice(car.getSoundSystem()) +
                       OptionPrice.getSafetyPackagePrice(car.getSafetyPackage());
        car.setTotalPrice(price);
        return this;
    }

    public Car build() {
        return this.car;
    }
}
