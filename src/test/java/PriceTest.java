import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceTest {

    Price price;

    @Before
    public void setUp(){
        price = new Price(100, 300);
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(100, price.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(300, price.getSellingPrice());
    }

}
