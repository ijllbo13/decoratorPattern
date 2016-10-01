package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Jorge on 10/1/2016.
 */
public class QuesoTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        queso.size = Taco.REGULAR;
        double cost = queso.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        queso.size = Taco.MEGA;
        double cost = queso.cost();
        assertEquals(14.0, cost,0);
    }

    @Test
    public void testCostMini() throws Exception{
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        queso.size = Taco.MINI;
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso,", desc);
    }
}
