package goods;

import behaviours.IPlay;
import behaviours.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {

    Price price;
    private int numberOfKeys;

    public Keyboard(String colour, String model, String make, int numberOfKeys, Price price){
        super(colour, model, make);
        this.numberOfKeys = numberOfKeys;
        this.price = price;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String sound) {
        return sound;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return (sellingPrice - buyingPrice);
    }

}

