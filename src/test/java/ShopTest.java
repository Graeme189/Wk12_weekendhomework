import goods.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar1;
    Price price1;
    Price price2;
    Price price3;
    Price price4;
    Keyboard keyboard1;
    GuitarStrings guitarStrings1;
    DrumSticks drumSticks1;

    @Before
    public void setUp(){
        shop = new Shop();
        price1 = new Price(800, 1400);
        price2 = new Price(400, 600);
        price3 = new Price(5, 10);
        guitar1 = new Guitar("blue", "SG", "Gibson", 7, price1);
        keyboard1 = new Keyboard("white", "RGX500", "Yamaha", 88, price2);
        drumSticks1 = new DrumSticks(price3);
        guitarStrings1 = new GuitarStrings(price4);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar1);
        shop.addStock(keyboard1);
        shop.addStock(drumSticks1);
        shop.addStock(guitarStrings1);
        assertEquals(4, shop.countStock());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar1);
        shop.addStock(keyboard1);
        shop.addStock(drumSticks1);
        shop.addStock(guitarStrings1);
        shop.removeStock(guitar1);
        assertEquals(3, shop.countStock());
    }
}
