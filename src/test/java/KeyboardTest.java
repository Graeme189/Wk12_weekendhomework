import goods.Keyboard;
import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;
    Price price;

    @Before
    public void before(){
        price = new Price(300, 700);
        keyboard = new Keyboard("black", "PGX500", "Yamaha", 88, price);
    }

    @Test
    public void canGetColour() {
        assertEquals("black", keyboard.getColour());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", keyboard.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("PGX500", keyboard.getModel());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, keyboard.getNumberOfKeys());
    }

    @Test
    public void canPlayPiano() {
        assertEquals("Plonk!", keyboard.play("Plonk!"));
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(300, price.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(700, price.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400, keyboard.calculateMarkup(price.getBuyingPrice(), price.getSellingPrice()));
    }

}
