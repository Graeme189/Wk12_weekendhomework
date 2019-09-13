import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("black", "PGX500", "Yamaha", 88);
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
}
