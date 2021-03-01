/**
 * Created by Craciun Tudor
 */

/**
 * This class keeps all information about a given destination
 */

public class Destination extends Place {
    private int demand;

    public Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }

    /**
     * Place is a superclass of both Source and Destination that contains a common attribute: the name
     */

    public boolean equalsPlace(Place place) {
        return this.name.equals(place.name);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
