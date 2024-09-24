public class Bluetooth {
    private String connectedDevice;

    public void turnOn() {
        System.out.println("Bluetooth is now ON.");
    }

    public void turnOff() {
        System.out.println("Bluetooth is now OFF.");
    }

    public void connectDevice(String deviceName) {
        this.connectedDevice = deviceName;
        System.out.println("Connected to Bluetooth device: " + deviceName);
    }
}
