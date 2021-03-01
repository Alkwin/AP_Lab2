/**
 * Created by Craciun Tudor
 */

import kotlin.Triple;

import java.util.ArrayList;

/**
 * We want to use this class to manage all expenses
 */

public class ExpenseManager {

    // the sources
    ArrayList<Source> sources = new ArrayList<>();

    // the destinations
    ArrayList<Destination> destinations = new ArrayList<>();

    //an array of pairs that holds the options where a source can go
    //we will associate the names of the sources and destination in the Pair with the value in the ArrayList above
    ArrayList<Triple<String, String, Integer>> sourcesOptions = new ArrayList<>();

    public boolean addSource(Source newSource) {
        if(sourceExists(newSource)) {
            return false;  // if there is a source with this name already then we can't add it
        }
        sources.add(newSource);
        return true;
    }

    public boolean addDestination(Destination newDestination) {
        if(destinationExists(newDestination)) {
            return false;  // if there is a destination with this name already then we can't add it
        }
        destinations.add(newDestination);
        return true;
    }

    public boolean addOption(Source source, Destination destination, Integer cost) {
        if(sourceExists(source) && destinationExists(destination) && isNewOption(source, destination) && cost>=0) {
            Triple<String, String, Integer> newTriple = new Triple<>(source.name, destination.name, cost);
            sourcesOptions.add(newTriple);
        }
        return false; // either the destination or the source have not been added yet
    }

    private boolean isNewOption(Source source, Destination destination) {
        for(Triple<String, String, Integer> option : sourcesOptions) {
            if(option.getFirst().equals(source.name) && option.getSecond().equals(destination.name)) {
                return false;
            }
        }
        return true;
    }


    public boolean sourceExists(Source newSource) {
        for (Source source : sources) {
            if (source.equalsPlace(newSource)) {
                return true;
            }
        }
        return false;
    }

    public boolean destinationExists(Destination newDestination) {
        for (Destination destination : destinations) {
            if (destination.equalsPlace(newDestination)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ExpenseManager{" +
                "\nsources=" + sources +
                ", \ndestinations=" + destinations +
                ", \nsourcesOptions=" + sourcesOptions +
                '}';
    }
}
