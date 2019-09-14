package goods;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell  {

    Price price;

    private int numberOfStrings;

    public Guitar(String colour, String model, String make, int numberOfStrings, Price price){
        super(colour, model, make);
        this.numberOfStrings = numberOfStrings;
        this.price = price;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(String sound) {
        return sound;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return (sellingPrice - buyingPrice);
    }
}
