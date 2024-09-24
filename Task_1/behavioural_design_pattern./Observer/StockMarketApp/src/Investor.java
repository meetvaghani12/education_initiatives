public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("Investor " + name + " notified: " + stockSymbol + " is now " + stockPrice);
    }

    public String getName() {
        return name;
    }
}
