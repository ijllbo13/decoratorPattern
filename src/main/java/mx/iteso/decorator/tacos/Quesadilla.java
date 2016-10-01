package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {

    public Quesadilla(String size){
        description = "Quesadilla";
        this.size = size;
    }

    private Quesadilla(){}

    @Override
    public double cost() throws Exception {
        return 10.00;
    }
}
