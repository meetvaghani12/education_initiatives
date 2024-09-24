package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

public class ActivatePanelsCommand implements Command {
    @Override
    public void execute(Satellite satellite) throws SatelliteException {
        satellite.setSolarPanelsStatus("Active");
    }

    @Override
    public void logExecution(CommandLogger logger) {
        logger.log("ActivatePanelsCommand executed: Solar Panels activated.");
    }
}
