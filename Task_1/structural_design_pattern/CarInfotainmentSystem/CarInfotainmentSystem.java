public class CarInfotainmentSystem {
    public static void main(String[] args) {
        // Facade to interact with car infotainment system
        InfotainmentFacade infotainment = new InfotainmentFacade();

        // Use the infotainment system
        infotainment.startGPS("221B Baker Street, London");
        infotainment.playMusic("Top Hits Playlist");
        infotainment.connectBluetooth("John's Phone");
        infotainment.setClimateControl(22);
        infotainment.checkCarDiagnostics();

        // Stopping all systems before car shutdown
        infotainment.shutdownSystems();
    }
}
