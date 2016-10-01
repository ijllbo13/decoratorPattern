package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso,";
    }

    @Override
    public double cost() throws Exception {
        if(this.size.equals(MEGA))
            return 6 + this.taco.cost();
        if(this.size.equals(REGULAR))
            return 4.00 + this.taco.cost();
        else
            return 2.00 + this.taco.cost();
    }
}
