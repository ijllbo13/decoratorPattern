package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Cebolla extends CondimentsDecorator {
    Taco taco;

    public Cebolla (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cebolla,";
    }

    @Override
    public double cost() throws Exception {
        return 0 + taco.cost();
    }
}
