package main;

import satellite.*;
import satellite.commands.*;
import satellite.logging.CommandLogger;
import utils.Scheduler;

public class Main {
    public static void main(String[] args) {
        try {
            Satellite satellite = Satellite.getInstance();
            SatelliteCommandExecutor executor = new SatelliteCommandExecutor();
            CommandLogger logger = new CommandLogger();

            executor.executeCommand(new RotateCommand(satellite, RotateDirection.SOUTH), logger);
            executor.executeCommand(new ActivatePanelsCommand(satellite), logger);
            executor.executeCommand(new CollectDataCommand(satellite), logger);

            // Scheduled command execution
            Scheduler scheduler = new Scheduler();
            scheduler.schedule(() -> executor.executeCommand(new RotateCommand(satellite, RotateDirection.EAST), logger), 2000);
            scheduler.schedule(() -> executor.executeCommand(new CollectDataCommand(satellite), logger), 4000);

            System.out.println(satellite);
        } catch (SatelliteException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
