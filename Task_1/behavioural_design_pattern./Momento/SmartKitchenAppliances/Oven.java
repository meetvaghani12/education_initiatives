public class Oven extends Appliance {
    public Oven(CookingAssistant assistant) {
        super(assistant);
    }

    @Override
    public void operate() {
        System.out.println("Oven is preheating...");
    }

    public void bake(String dish, int time) {
        System.out.printf("Baking %s for %d minutes in the oven...\n", dish, time);
        try {
            Thread.sleep(time * 1000); // Simulate baking time
        } catch (InterruptedException e) {
            System.out.println("Baking interrupted.");
        }
        System.out.printf("%s is baked and ready!\n", dish);
    }
}
