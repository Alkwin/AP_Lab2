import java.util.ArrayList;

/**
 * Created by Craciun Tudor
 */

/**
 * This class keeps all information about a given source; It is an abstract class out of which Factories and Warehouses are created
 */

abstract class Source extends Place {

    /**
     * We will keep the attribute 'type' because if we will pass a Factory or Warehouse object as a SourceOptional object (their common superclass)
     *                                                                                      we want to have a way to know which is what
     * P.S.: We might not have need of this, but we'll see as we implement more code
     */

    private String type;
    private int supply;

    public Source(String name, String type, int supply) {
        this.name = name;
        this.type = type;
        this.supply = supply;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", supply=" + supply +
                '}';
    }

    /**
     * Place is a superclass of both Source and Destination that contains a common attribute: the name
     */

    public boolean equalsPlace(Place place) {
        return this.name.equals(place.name);
    }

    /**
     * How are we supposed to use this if we can't get the name of the Source/Destination?
     * obj only takes the attributes of the superclass Object
     */

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
