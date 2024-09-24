public class CallLogger {
    public void logCall(Call call) {
        // Here we would log the call to a database or file
        System.out.println("Logging call for billing:");
        System.out.println("Caller: " + call.getCaller());
        System.out.println("Receiver: " + call.getReceiver());
        System.out.println("Duration: " + call.getDuration() + " seconds");
        System.out.println("Timestamp: " + call.getTimestamp());
        System.out.println("Call logged successfully.\n");
    }
}
