package instruments;

import behaviours.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private int numberOfKeys;

    public Keyboard(String colour, String model, String make, int numberOfKeys){
        super(colour, model, make);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String sound) {
        return sound;
    }

}

