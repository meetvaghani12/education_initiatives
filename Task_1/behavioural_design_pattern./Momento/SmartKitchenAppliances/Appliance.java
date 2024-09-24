public abstract class Appliance {
    protected CookingAssistant assistant;

    public Appliance(CookingAssistant assistant) {
        this.assistant = assistant;
    }

    public abstract void operate();
}
