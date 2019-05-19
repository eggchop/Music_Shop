import instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(50.00, 75.00, "Fender", 6);
    }

    @Test
    public void checkCanGetBuyPrice(){
        assertEquals(50.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void checkGuitarCanPlay(){
        assertEquals("The guitar is being strummed!", guitar.play());
    }

    @Test
    public void checkCanCalcluateMarkup(){
        assertEquals(25.00, guitar.calculateMarkup(), 0.01);
    }
}
