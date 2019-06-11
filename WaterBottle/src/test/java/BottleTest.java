import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void canDrinkSubtractTen(){
        bottle.drink();
        assertEquals(90, bottle.getVolume(), 0.01);
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume(), 0.01);
    }

    @Test
    public void canFill(){
        bottle.fill();
        assertEquals(100, bottle.getVolume(), 0.01);
    }
}
