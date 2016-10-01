package mx.iteso.decorator;

import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.condiments.meat.Shrimp;
import mx.iteso.decorator.condiments.meat.Fish;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args) {

        Taco taco2 = new TacoNormal(Taco.MEGA);

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        try {
            System.out.println("$" + taco2.cost() + " MXN");
        }catch(Exception C){}


        Taco taco3 = new Quesadilla(Taco.REGULAR);

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        try {
            System.out.println("$" + taco3.cost() + " MXN");
        }catch(Exception D){}

        Taco taco4 = new Volcan();

        taco4 = new TortillaMaiz(taco4);
        taco4 = new Chorizo(taco4);

        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        try {
            System.out.println("$" + taco4.cost() + " MXN");
        }catch(Exception E){}

        Taco taco5 = new TacoNormal(Taco.REGULAR);

        taco5 = new TortillaMaiz(taco5);
        taco5 = new Queso(taco5);
        taco5 = new Shrimp(taco5);

        System.out.println();
        System.out.println();
        System.out.println(taco5.getDescription());
        try {
            System.out.println("$" + taco5.cost() + " MXN");
        } catch(Exception F){}

        System.out.println();
        System.out.println();

        Taco taco6 = new Quesadilla(Taco.MINI);

        taco6 = new TortillaHarina(taco6);
        taco6 = new Cilantro(taco6);
        taco6 = new Cebolla(taco6);
        taco6 = new Queso(taco6);
        taco6 = new Fish(taco6);

        System.out.println(taco6.getDescription());
        try {
            System.out.println("$" + taco6.cost() + " MXN");
        }catch(Exception E){System.out.print("Ese tipo de taco no está disponible.");}
    }
}
