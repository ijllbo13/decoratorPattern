package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Jorge on 10/1/2016.
 */
public class ShrimpTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        shrimp.size = Taco.REGULAR;
        double cost = shrimp.cost();
        assertEquals(14.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        shrimp.size = Taco.MEGA;
        double cost = shrimp.cost();
        assertEquals(16.0, cost,0);
    }

    @Test(expected=Exception.class)
    public void testCostMini() throws Exception{
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        shrimp.size = Taco.MINI;
        double cost = shrimp.cost();
    }

    @Test
    public void testDescription(){
        Taco shrimp = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = shrimp.getDescription();
        assertEquals("Taco Normal de camarón", desc);
    }
}
