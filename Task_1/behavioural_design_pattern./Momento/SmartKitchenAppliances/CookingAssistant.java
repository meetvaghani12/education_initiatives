import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookingAssistant {
    private Oven oven;
    private Blender blender;
    private SmartScale scale;

    public CookingAssistant() {
        this.oven = new Oven(this);
        this.blender = new Blender(this);
        this.scale = new SmartScale(this);
    }

    public void prepareMeal(String dish, int bakingTime, List<Ingredient> ingredients) {
        System.out.println("\n--- Meal Preparation ---");
        System.out.printf("Starting preparation for %s...\n", dish);
        
        oven.operate();
        oven.bake(dish, bakingTime);

        scale.operate();
        for (Ingredient ingredient : ingredients) {
            scale.measure(ingredient.getName());
            blender.operate();
            blender.blend(ingredient.getName());
        }

        System.out.printf("%s is ready with all ingredients!\n", dish);
    }

    public void startCooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dish you want to prepare: ");
        String dish = scanner.nextLine();
        
        System.out.print("Enter the baking time in minutes: ");
        int bakingTime = scanner.nextInt();
        
        List<Ingredient> ingredients = new ArrayList<>();
        System.out.println("Enter ingredients (type 'done' to finish):");
        while (true) {
            System.out.print("Ingredient name: ");
            String ingredientName = scanner.next();
            if (ingredientName.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Quantity (grams): ");
            double quantity = scanner.nextDouble();
            ingredients.add(new Ingredient(ingredientName, quantity));
        }
        
        prepareMeal(dish, bakingTime, ingredients);
        scanner.close();
    }
}
