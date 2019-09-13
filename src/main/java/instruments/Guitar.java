package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String colour, String model, String make, int numberOfStrings){
        super(colour, model, make);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
