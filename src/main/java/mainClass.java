/**
 * Created by Tudor Craciun
 */

public class mainClass {

    /**
     * Here is where the program begins
     */

    protected void startProgram(String[] args) {
        //executeCompulsory();
        executeOptional();
    }

    private void executeCompulsory() {
        Compulsory obj = new Compulsory();
        obj.executeCompulsory();
    }

    private void executeOptional() {
        Optional obj = new Optional();
        obj.executeOptional();
    }
}