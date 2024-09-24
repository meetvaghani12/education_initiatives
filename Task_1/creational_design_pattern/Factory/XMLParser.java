package parsers;

public class XMLParser implements Parser {

    @Override
    public void parse(String filePath) {
        System.out.println("Parsing XML file: " + filePath);
        // Add XML parsing logic here
        System.out.println("XML file parsed successfully.");
    }
}
