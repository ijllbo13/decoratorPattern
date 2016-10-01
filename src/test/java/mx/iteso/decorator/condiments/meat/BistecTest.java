package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Queso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Jorge on 10/1/2016.
 */
public class BistecTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        bistec.size = Taco.REGULAR;
        double cost = bistec.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        bistec.size = Taco.MEGA;
        double cost = bistec.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMini() throws Exception{
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        bistec.size = Taco.MINI;
        double cost = bistec.cost();
        assertEquals(7.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }
}
