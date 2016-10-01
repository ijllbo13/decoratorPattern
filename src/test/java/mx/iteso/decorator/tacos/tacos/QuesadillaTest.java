package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 10/1/2016.
 */
public class QuesadillaTest {
    @Test
    public void testCost() throws Exception{
        Taco quesadilla = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, quesadilla.cost(),0);
    }
}
