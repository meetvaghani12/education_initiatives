public class BillingProxy {
    private CallService callService;
    private CallLogger callLogger;

    public BillingProxy() {
        this.callService = new CallService();
        this.callLogger = new CallLogger();
    }

    public void makeCall(String caller, String receiver, long duration, String timestamp) {
        Call call = new Call(caller, receiver, duration, timestamp);
        
        // Log the call
        callLogger.logCall(call);
        
        // Process the call
        callService.processCall(call);
    }
}
