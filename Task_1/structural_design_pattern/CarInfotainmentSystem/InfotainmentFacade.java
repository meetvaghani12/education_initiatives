public class InfotainmentFacade {
    private GPS gps;
    private MusicSystem musicSystem;
    private Bluetooth bluetooth;
    private ClimateControl climateControl;
    private CarDiagnostics carDiagnostics;

    public InfotainmentFacade() {
        this.gps = new GPS();
        this.musicSystem = new MusicSystem();
        this.bluetooth = new Bluetooth();
        this.climateControl = new ClimateControl();
        this.carDiagnostics = new CarDiagnostics();
    }

    public void startGPS(String destination) {
        gps.turnOn();
        gps.setDestination(destination);
    }

    public void playMusic(String playlist) {
        musicSystem.turnOn();
        musicSystem.playPlaylist(playlist);
    }

    public void connectBluetooth(String deviceName) {
        bluetooth.turnOn();
        bluetooth.connectDevice(deviceName);
    }

    public void setClimateControl(int temperature) {
        climateControl.turnOn();
        climateControl.setTemperature(temperature);
    }

    public void checkCarDiagnostics() {
        carDiagnostics.runFullCheck();
    }

    public void shutdownSystems() {
        gps.turnOff();
        musicSystem.turnOff();
        bluetooth.turnOff();
        climateControl.turnOff();
        System.out.println("All systems are turned off.");
    }
}
