/**
 * Created by Craciun Tudor
 */

/**
 * This class holds the Compulsory part of the 2nd laboratory
 * It showcases a 'hardcoded' example on how the created classes should be used
 */

public class Compulsory {
    ExpenseManager em = new ExpenseManager();

    public void executeCompulsory() {
        Factory s1 = new Factory("S1", 10);
        addNewSource(s1);
        Warehouse s2 = new Warehouse("S2", 35);
        addNewSource(s2);
        Warehouse s3 = new Warehouse("S2", 25);
        addNewSource(s3);

        Destination d1 = new Destination("D1", 20);
        addNewDestination(new Destination("D1", 20));
        Destination d2 = new Destination("D2", 25);
        addNewDestination(d2);
        Destination d3 = new Destination("D3", 25);
        addNewDestination(d3);

        addNewExpense(s1, d1, 2);
        addNewExpense(s1, d2, 3);
        addNewExpense(s1, d3, 1);

        addNewExpense(s2, d1, 5);
        addNewExpense(s2, d2, 4);
        addNewExpense(s2, d3, 8);

        addNewExpense(s3, d1, 5);
        addNewExpense(s3, d2, 6);
        addNewExpense(s3, d3, 8);

        System.out.println(em.toString());

    }

    public void addNewSource(Source source) {
        em.addSource(source);
    }

    public void addNewDestination(Destination destination) {
        em.addDestination(destination);
    }

    public void addNewExpense(Source source,
                              Destination destination,
                              Integer cost
    ) {
        em.addOption(source, destination, cost);
    }
}
