import goods.Guitar;
import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar1;
    Price price;

    @Before
    public void setUp(){
        shop = new Shop();
        price = new Price(800, 1400);
        guitar1 = new Guitar("blue", "SG", "Gibson", 7, price);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar1);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(guitar1);
        assertEquals(0, shop.countStock());
    }
}
