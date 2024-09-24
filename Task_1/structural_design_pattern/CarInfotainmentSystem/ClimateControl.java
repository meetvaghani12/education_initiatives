public class ClimateControl {
    private int temperature;

    public void turnOn() {
        System.out.println("Climate control is now ON.");
    }

    public void turnOff() {
        System.out.println("Climate control is now OFF.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Climate control set to: " + temperature + "°C");
    }
}
