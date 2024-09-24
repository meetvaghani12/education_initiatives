package satellite.commands;

import satellite.Satellite;
import satellite.SatelliteException;
import satellite.logging.CommandLogger;

public class RotateCommand implements Command {
    private RotateDirection direction;

    public RotateCommand(RotateDirection direction) {
        this.direction = direction;
    }

    @Override
    public void execute(Satellite satellite) throws SatelliteException {
        satellite.setOrientation(direction.name());
    }

    @Override
    public void logExecution(CommandLogger logger) {
        logger.log("RotateCommand executed: " + direction.name());
    }
}
