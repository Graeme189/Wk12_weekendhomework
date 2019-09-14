package goods;

public class Price {

    private int buyingPrice;
    private int sellingPrice;

    public Price(int buyingPrice, int sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
