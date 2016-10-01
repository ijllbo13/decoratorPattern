package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {

    public TacoNormal(String size){
        description = "Taco normal";
        this.size = size;
    }

    // Para no pedir un taco normal sin pasarle un tama;o
    private TacoNormal(){}

    @Override
    public double cost() throws Exception {
        return 8.00;
    }
}
