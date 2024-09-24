package parsers;

public class Main {
    
    public static void main(String[] args) {
        String fileType = "csv";  // File type can be csv, json, or xml
        String filePath = "data/sample." + fileType;  // Path to the file to be parsed

        // Get the appropriate parser using the factory
        Parser parser = ParserFactory.getParser(fileType);
        
        // Call the parse method on the chosen parser
        parser.parse(filePath);
    }
}
