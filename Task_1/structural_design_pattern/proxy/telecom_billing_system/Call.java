public class Call {
    private String caller;
    private String receiver;
    private long duration; // Duration in seconds
    private String timestamp;

    public Call(String caller, String receiver, long duration, String timestamp) {
        this.caller = caller;
        this.receiver = receiver;
        this.duration = duration;
        this.timestamp = timestamp;
    }

    public String getCaller() {
        return caller;
    }

    public String getReceiver() {
        return receiver;
    }

    public long getDuration() {
        return duration;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
