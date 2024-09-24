public class Blender extends Appliance {
    public Blender(CookingAssistant assistant) {
        super(assistant);
    }

    @Override
    public void operate() {
        System.out.println("Blender is ready to use.");
    }

    public void blend(String ingredient) {
        System.out.printf("Blending %s...\n", ingredient);
        try {
            Thread.sleep(2000); // Simulate blending time
        } catch (InterruptedException e) {
            System.out.println("Blending interrupted.");
        }
        System.out.printf("%s is blended smoothly!\n", ingredient);
    }
}
