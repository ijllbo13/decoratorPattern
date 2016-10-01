package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by Jorge on 9/29/2016.
 */
public class Volcan extends Taco {

    public Volcan()
    {
        this.size.equals(REGULAR);
        description = ("Volcan");
    }

    @Override
    public double cost() throws Exception {
        return 12.00;
    }
}
