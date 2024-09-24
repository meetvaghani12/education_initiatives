package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

public class DeactivatePanelsCommand implements Command {
    @Override
    public void execute(Satellite satellite) throws SatelliteException {
        satellite.setSolarPanelsStatus("Inactive");
    }

    @Override
    public void logExecution(CommandLogger logger) {
        logger.log("DeactivatePanelsCommand executed: Solar Panels deactivated.");
    }
}
