package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

import java.util.ArrayList;
import java.util.List;

public class SatelliteCommandExecutor {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command, CommandLogger logger) {
        try {
            command.execute(Satellite.getInstance());
            command.logExecution(logger);
            commandHistory.add(command);
        } catch (SatelliteException e) {
            logger.log("Error executing command: " + e.getMessage());
        }
    }

    public List<Command> getCommandHistory() {
        return commandHistory;
    }
}
