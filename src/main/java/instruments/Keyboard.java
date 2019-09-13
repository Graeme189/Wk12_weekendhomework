package instruments;

public class Keyboard extends Instrument {

    private int numberOfKeys;

    public Keyboard(String colour, String model, String make, int numberOfKeys){
        super(colour, model, make);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}

