public class Expense {
    Destination destination;
    int cost;

    public Expense(Destination destination, int cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
