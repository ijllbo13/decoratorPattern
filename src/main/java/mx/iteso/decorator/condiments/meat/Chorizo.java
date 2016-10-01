package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() throws Exception {
        if(this.size.equals(MEGA))
            return 2 + this.taco.cost();
        if(this.size.equals(REGULAR))
            return this.taco.cost();
        else
            return -1 + this.taco.cost();
    }

}
