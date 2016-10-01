package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Cilantro extends CondimentsDecorator {
    Taco taco;

    public Cilantro (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cilantro,";
    }

    @Override
    public double cost() throws Exception {
        return 0 + taco.cost();
    }
}
