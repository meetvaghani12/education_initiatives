public class CallService {
    public void processCall(Call call) {
        System.out.println("Processing call:");
        System.out.println("Caller: " + call.getCaller());
        System.out.println("Receiver: " + call.getReceiver());
        System.out.println("Duration: " + call.getDuration() + " seconds");
        System.out.println("Timestamp: " + call.getTimestamp());
        System.out.println("Call processed successfully.\n");
    }
}
