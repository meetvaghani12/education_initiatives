package utils;

import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    private final Timer timer = new Timer();

    public void schedule(Runnable command, long delay) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                command.run();
            }
        }, delay);
    }
}
