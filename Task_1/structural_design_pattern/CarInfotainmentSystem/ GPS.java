public class GPS {
    private String destination;

    public void turnOn() {
        System.out.println("GPS is now ON.");
    }

    public void turnOff() {
        System.out.println("GPS is now OFF.");
    }

    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println("GPS is set to navigate to: " + destination);
    }
}
