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
public class LenguaTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        lengua.size = Taco.REGULAR;
        double cost = lengua.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        lengua.size = Taco.MEGA;
        double cost = lengua.cost();
        assertEquals(14.0, cost,0);
    }

    @Test
    public void testCostMini() throws Exception{
        Taco lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        lengua.size = Taco.MINI;
        double cost = lengua.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = lengua.getDescription();
        assertEquals("Taco Normal de lengua", desc);
    }
}
