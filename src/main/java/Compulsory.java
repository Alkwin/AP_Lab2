public class Compulsory {
    public void executeCompulsory() {
        initializeHardCodedInstance();
    }

    private void initializeHardCodedInstance() {
        Source s1 = new Source("S1", SourceType.FACTORY, 10);
        Source s2 = new Source("S2", SourceType.WAREHOUSE, 35);
        Source s3 = new Source("S2", SourceType.WAREHOUSE, 25);

        Destination d1 = new Destination("D1", 20);
        Destination d2 = new Destination("D2", 25);
        Destination d3 = new Destination("D3", 25);

        s1.addExpense(d1, 2);
        s1.addExpense(d2, 3);
        s1.addExpense(d3, 1);

        s2.addExpense(d1, 5);
        s2.addExpense(d2, 4);
        s2.addExpense(d3, 8);

        s3.addExpense(d1, 5);
        s3.addExpense(d2, 6);
        s3.addExpense(d3, 8);

        displayTable(s1);
        displayTable(s2);
        displayTable(s3);
    }

    private void displayTable(Source source) {
        displayMessageNewLine(source.getName() + " ");
        for(int i = 0; i < source.destinationsAndCosts.size(); i++) {
            displayMessageNewLine("   " + source.destinationsAndCosts.get(i).destination.getName() + " " + source.destinationsAndCosts.get(i).cost);
        }
    }

    private void displayMessage(String message) {
        System.out.print(message);
    }

    private void displayMessageNewLine(String message) {
        System.out.println(message);
    }
}
