package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

public class CollectDataCommand implements Command {
    @Override
    public void execute(Satellite satellite) throws SatelliteException {
        satellite.collectData();
    }

    @Override
    public void logExecution(CommandLogger logger) {
        logger.log("CollectDataCommand executed: Data collected.");
    }
}
