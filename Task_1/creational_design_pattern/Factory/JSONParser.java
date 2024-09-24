package parsers;

public class JSONParser implements Parser {

    @Override
    public void parse(String filePath) {
        System.out.println("Parsing JSON file: " + filePath);
        // Add JSON parsing logic here
        System.out.println("JSON file parsed successfully.");
    }
}
