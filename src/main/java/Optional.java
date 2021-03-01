import kotlin.Triple;

import java.util.ArrayList;

public class Optional {

    ExpenseManager em = new ExpenseManager();

    public void executeOptional() {
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

        //displayTable();

        computeSimpleSolution();

    }

    private void displayTable() {
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

    public void computeSimpleSolution() {
        ArrayList<SolutionElement> simpleSolution = new ArrayList<>();
        for(int i = 0; i < em.sources.size(); i++) {
            while(em.sources.get(i).getSupply() > 0) {
                Triple<String, String, Integer> cheapest = getCheapestForSource(em.sources.get(i));
            }
        }
    }

    private Triple<String, String, Integer> getCheapestForSource(Source source) {
        Triple<String, String, Integer> cheapest = new Triple<String, String, Integer>("", "", 10000);
        for(int i = 0; i < em.sourcesOptions.size(); i++) {
            if(em.sourcesOptions.get(i).getFirst().equals(source.name)) {
                if(em.sourcesOptions.get(i).getThird() < cheapest.getThird()) {
                    cheapest = em.sourcesOptions.get(i);
                }
            }
        }

        return cheapest;
    }

}
