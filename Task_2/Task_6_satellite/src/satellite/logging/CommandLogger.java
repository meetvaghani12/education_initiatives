package satellite.logging;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CommandLogger {
    private static final String LOG_FILE = "command_log.txt";

    public void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            throw new CommandLoggerException("Error logging message: " + e.getMessage());
        }
    }
}
