package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 10/1/2016.
 */
public class VolcanTest {
    @Test
    public void testCost() throws Exception{
        Taco volcan = new Volcan();
        assertEquals(12.0, volcan.cost(),0);
    }
}
