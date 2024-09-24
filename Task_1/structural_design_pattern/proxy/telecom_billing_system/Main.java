public class Main {
    public static void main(String[] args) {
        BillingProxy billingProxy = new BillingProxy();

        // Simulating some calls
        billingProxy.makeCall("Alice", "Bob", 300, "2024-09-24 10:15:00");
        billingProxy.makeCall("Charlie", "Dave", 120, "2024-09-24 10:30:00");
        billingProxy.makeCall("Eve", "Frank", 240, "2024-09-24 10:45:00");
    }
}
