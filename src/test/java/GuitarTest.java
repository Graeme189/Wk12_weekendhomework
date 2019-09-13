import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("black", "Swamp Ash", "PRS", 6);
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
}
