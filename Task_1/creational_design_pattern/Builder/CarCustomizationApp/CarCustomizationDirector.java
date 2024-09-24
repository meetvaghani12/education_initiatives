public class CarCustomizationDirector {

    private CarBuilder carBuilder;

    public CarCustomizationDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() throws InvalidOptionException {
        CarType carType = CarType.valueOf(InputHelper.getInput("Choose Car Type (SEDAN, SUV, TRUCK): ").toUpperCase());
        carBuilder.setCarType(carType);

        String interiorMaterial = InputHelper.getInput("Choose Interior Material (Leather, Fabric): ");
        carBuilder.setInteriorMaterial(interiorMaterial);

        String soundSystem = InputHelper.getInput("Choose Sound System (Basic, Premium, Surround): ");
        carBuilder.setSoundSystem(soundSystem);

        String safetyPackage = InputHelper.getInput("Choose Safety Package (Standard, Advanced, Full): ");
        carBuilder.setSafetyPackage(safetyPackage);

        return carBuilder.calculateTotalPrice().build();
    }
}
