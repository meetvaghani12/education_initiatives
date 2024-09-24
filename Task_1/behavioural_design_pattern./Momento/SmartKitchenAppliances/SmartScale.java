import java.util.Random;

public class SmartScale extends Appliance {
    private Random random;

    public SmartScale(CookingAssistant assistant) {
        super(assistant);
        random = new Random();
    }

    @Override
    public void operate() {
        System.out.println("Smart Scale is ready.");
    }

    public double measure(String ingredient) {
        double weight = 50 + random.nextDouble() * 100; // Random weight between 50 and 150 grams
        System.out.printf("Measuring %.2f grams of %s.\n", weight, ingredient);
        return weight;
    }
}
