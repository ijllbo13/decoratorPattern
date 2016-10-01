package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by Jorge on 9/29/2016.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() throws Exception {
        if(this.size.equals(MEGA))
            return 7 + this.taco.cost();
        if(this.size.equals(REGULAR))
            return 5.00 + this.taco.cost();
        else
            throw new Exception("UNAVAILABLE TACO");
    }
}
