package goods;

import behaviours.ISell;

public class GuitarStrings implements ISell {

    Price price;

    public GuitarStrings(Price price){
        this.price = price;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return (sellingPrice - buyingPrice);
    }
}
