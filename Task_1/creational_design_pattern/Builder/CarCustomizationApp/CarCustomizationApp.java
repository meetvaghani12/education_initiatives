public class CarCustomizationApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Automobile Dealership Car Customization!");

        CarBuilder carBuilder = new CarBuilder(); // Correct CarBuilder constructor usage
        CarCustomizationDirector director = new CarCustomizationDirector(carBuilder); // Pass CarBuilder to director

        try {
            Car customCar = director.construct(); // Properly call the construct() method
            System.out.println("\nYour customized car details:");
            System.out.println(customCar);
        } catch (InvalidOptionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
