package parsers;

public class CSVParser implements Parser {

    @Override
    public void parse(String filePath) {
        System.out.println("Parsing CSV file: " + filePath);
        // Add CSV parsing logic here
        System.out.println("CSV file parsed successfully.");
    }
}
