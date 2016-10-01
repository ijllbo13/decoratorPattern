package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Jorge on 9/29/2016.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camarón";
    }

    @Override
    public double cost() throws Exception {
        if(this.size.equals(MEGA))
            return 8 + this.taco.cost();
        if(this.size.equals(REGULAR))
            return 6.00 + this.taco.cost();
        else
            throw new Exception("UNAVAILABLE TACO");
    }
}
