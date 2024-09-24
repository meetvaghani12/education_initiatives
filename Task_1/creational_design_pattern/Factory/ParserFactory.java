package parsers;

public class ParserFactory {
    
    // Method to return the appropriate parser based on the file type
    public static Parser getParser(String fileType) {
        if (fileType == null) {
            throw new IllegalArgumentException("File type cannot be null");
        }

        switch (fileType.toLowerCase()) {
            case "csv":
                return new CSVParser();
            case "json":
                return new JSONParser();
            case "xml":
                return new XMLParser();
            default:
                throw new UnsupportedOperationException("Unsupported file type: " + fileType);
        }
    }
}
