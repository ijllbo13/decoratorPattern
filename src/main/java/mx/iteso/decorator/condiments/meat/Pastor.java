package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() throws Exception {
        if(this.size.equals(MEGA))
            return 2 + this.taco.cost();
        if(this.size.equals(REGULAR))
            return this.taco.cost();
        else
            return -1.00 + this.taco.cost();
    }
}
