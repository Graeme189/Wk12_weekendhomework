import goods.Guitar;
import goods.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Price price;

    @Before
    public void before(){
        price = new Price(200, 600);
        guitar = new Guitar("black", "Swamp Ash", "PRS", 6, price);
    }

    @Test
    public void canGetColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canGetModel() {
        assertEquals("Swamp Ash", guitar.getModel());
    }

    @Test
    public void canGetMake() {
        assertEquals("PRS", guitar.getMake());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Twang!", guitar.play("Twang!"));
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(200, price.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(600, price.getSellingPrice());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(400, guitar.calculateMarkup(price.getBuyingPrice(), price.getSellingPrice()));
    }
}
