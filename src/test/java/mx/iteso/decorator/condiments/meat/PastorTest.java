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
public class PastorTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        pastor.size = Taco.REGULAR;
        double cost = pastor.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        pastor.size = Taco.MEGA;
        double cost = pastor.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMini() throws Exception{
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        pastor.size = Taco.MINI;
        double cost = pastor.cost();
        assertEquals(7.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }
}
