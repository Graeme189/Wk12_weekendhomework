package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String colour, String model, String make, int numberOfStrings){
        super(colour, model, make);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(String sound) {
        return sound;
    }
}
