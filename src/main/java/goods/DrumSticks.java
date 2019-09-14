package goods;

import behaviours.ISell;

public class DrumSticks implements ISell {

    Price price;

    public DrumSticks(Price price) {
        this.price = price;
    }

    public int calculateMarkup(int buyingPrice, int sellingPrice){
        return (sellingPrice - buyingPrice);
    }
}
