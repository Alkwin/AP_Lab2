/**
 * Created by Craciun Tudor
 */

/**
 * This class holds the cost that a source
 *                      should pay to get its supplies to a given destination
 */

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

    @Override
    public String toString() {
        return "Expense{" +
                "destination=" + destination +
                ", cost=" + cost +
                '}';
    }
}
