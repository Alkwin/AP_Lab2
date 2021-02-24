import java.util.ArrayList;

/**
 * Created by Craciun Tudor
 */

/**
 * This class keeps all information about a given source
 * The {@link #destinationsAndCosts} ArrayList holds all the destinations to where the current source can go
 *                                                                                        and their adjacent costs
 */

public class Source {

    private String name;
    private SourceType type;
    private int supply;
    protected ArrayList<Expense> destinationsAndCosts = new ArrayList();

    public Source(String name, SourceType type, int supply) {
        this.name = name;
        this.type = type;
        this.supply = supply;
    }

    protected boolean addExpense(Destination destination, int cost) {
        if(cost < 0) {
            return false;
        }
        destinationsAndCosts.add(new Expense(destination, cost));
        return true;
    }

    public int getSupply() {
        return supply;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public SourceType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", supply=" + supply +
                ", destinationsAndCosts=" + destinationsAndCosts +
                '}';
    }
}
