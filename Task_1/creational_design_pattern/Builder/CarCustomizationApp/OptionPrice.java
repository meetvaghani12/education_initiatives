public class OptionPrice {
    public static double getInteriorPrice(String interior) {
        switch (interior.toLowerCase()) {
            case "leather":
                return 2000;
            case "fabric":
                return 1000;
            default:
                return 0;
        }
    }

    public static double getSoundSystemPrice(String soundSystem) {
        switch (soundSystem.toLowerCase()) {
            case "basic":
                return 500;
            case "premium":
                return 1500;
            case "surround":
                return 2500;
            default:
                return 0;
        }
    }

    public static double getSafetyPackagePrice(String safetyPackage) {
        switch (safetyPackage.toLowerCase()) {
            case "standard":
                return 1000;
            case "advanced":
                return 3000;
            case "full":
                return 5000;
            default:
                return 0;
        }
    }
}
