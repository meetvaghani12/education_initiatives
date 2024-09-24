package satellite;

public class Satellite {
    private static Satellite instance;
    private String orientation;
    private String solarPanelsStatus;
    private int dataCollected;

    private Satellite() {
        this.orientation = "North";
        this.solarPanelsStatus = "Inactive";
        this.dataCollected = 0;
    }

    public static synchronized Satellite getInstance() {
        if (instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

    public void setOrientation(String orientation) throws SatelliteException {
        if (orientation == null || orientation.isEmpty()) {
            throw new SatelliteException("Invalid orientation value.");
        }
        this.orientation = orientation;
    }

    public void setSolarPanelsStatus(String status) throws SatelliteException {
        if (status == null || status.isEmpty()) {
            throw new SatelliteException("Invalid solar panels status.");
        }
        this.solarPanelsStatus = status;
    }

    public void collectData() throws SatelliteException {
        if (this.solarPanelsStatus.equals("Active")) {
            this.dataCollected += 10;
        } else {
            throw new SatelliteException("Cannot collect data: Solar panels are inactive.");
        }
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation + ", Solar Panels: " + solarPanelsStatus + ", Data Collected: " + dataCollected;
    }
}
