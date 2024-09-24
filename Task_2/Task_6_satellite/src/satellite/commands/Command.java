package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

public interface Command {
    void execute(Satellite satellite) throws SatelliteException;
    void logExecution(CommandLogger logger);
}
