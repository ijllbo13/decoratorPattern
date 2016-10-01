package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Jorge on 10/1/2016.
 */
public class FishTest {

    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        Taco pescado = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        pescado.size = Taco.REGULAR;
        double cost = pescado.cost();
        assertEquals(13.0, cost,0);
    }

    @Test
    public void testCostMega() throws Exception{
        Taco pescado = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        pescado.size = Taco.MEGA;
        double cost = pescado.cost();
        assertEquals(15.0, cost,0);
    }

    @Test(expected = Exception.class)
    public void testCostMini() throws Exception{
        Taco pescado = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        pescado.size = Taco.MINI;
        double cost = pescado.cost();
    }

    @Test
    public void testDescription(){
        Taco pescado = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
}
