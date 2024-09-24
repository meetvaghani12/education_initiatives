import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockMarketDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Stock> stockList = new ArrayList<>();
        List<Investor> investorList = new ArrayList<>();

        // Interactive Stock creation
        System.out.println("Welcome to the Stock Market App");
        
        System.out.println("How many stocks would you like to create?");
        int stockCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < stockCount; i++) {
            System.out.println("Enter stock symbol for stock " + (i + 1) + ":");
            String stockSymbol = scanner.nextLine();

            System.out.println("Enter the initial price of " + stockSymbol + ":");
            double stockPrice = Double.parseDouble(scanner.nextLine());

            stockList.add(new Stock(stockSymbol, stockPrice));
        }

        // Interactive Investor creation
        System.out.println("How many investors would you like to create?");
        int investorCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < investorCount; i++) {
            System.out.println("Enter the name of investor " + (i + 1) + ":");
            String investorName = scanner.nextLine();

            investorList.add(new Investor(investorName));
        }

        // Subscribe investors to stocks
        for (Investor investor : investorList) {
            System.out.println("Which stock would you like investor " + investor.getName() + " to subscribe to?");
            for (int j = 0; j < stockList.size(); j++) {
                System.out.println((j + 1) + ". " + stockList.get(j).getSymbol());
            }
            int stockChoice = Integer.parseInt(scanner.nextLine()) - 1;
            Stock selectedStock = stockList.get(stockChoice);
            selectedStock.addObserver(investor);
            System.out.println("Investor " + investor.getName() + " is now subscribed to " + selectedStock.getSymbol());
        }

        // Update stock prices
        while (true) {
            System.out.println("\nWould you like to update a stock price? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                break;
            }

            System.out.println("Which stock would you like to update?");
            for (int j = 0; j < stockList.size(); j++) {
                System.out.println((j + 1) + ". " + stockList.get(j).getSymbol() + " (Current Price: " + stockList.get(j).getPrice() + ")");
            }
            int stockChoice = Integer.parseInt(scanner.nextLine()) - 1;
            Stock selectedStock = stockList.get(stockChoice);

            System.out.println("Enter the new price for " + selectedStock.getSymbol() + ":");
            double newPrice = Double.parseDouble(scanner.nextLine());
            selectedStock.setPrice(newPrice);
        }

        scanner.close();
        System.out.println("Thank you for using the Stock Market App!");
    }
}
