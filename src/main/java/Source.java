import java.util.ArrayList;

public class Source {

    private String name;
    private SourceType type;
    protected int supply;

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

}
