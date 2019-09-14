import goods.GuitarStrings;
import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;
    Price price;

    @Before
    public void setUp() {
        this.price = new Price(3, 10);
        this.guitarStrings = new GuitarStrings(price);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(3, price.getBuyingPrice());
    }
    @Test
    public void canGetSellingPrice() {
        assertEquals(10, price.getSellingPrice());
    }

    @Test
    public void canCalulateMarkup() {
        assertEquals(7, guitarStrings.calculateMarkup(price.getBuyingPrice(), price.getSellingPrice()));
    }
}
