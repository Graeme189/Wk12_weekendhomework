import goods.DrumSticks;
import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;
    Price price;

    @Before
    public void setUp(){
        price = new Price(5, 12);
        this.drumSticks = new DrumSticks(price);
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(5, price.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(12, price.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(7, drumSticks.calculateMarkup(price.getBuyingPrice(), price.getSellingPrice()));
    }
}
