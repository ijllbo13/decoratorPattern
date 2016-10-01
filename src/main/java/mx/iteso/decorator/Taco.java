package mx.iteso.decorator;

public abstract class Taco {

    public static final String REGULAR = "tamaño regular";
    public static final String MINI = "mini";
    public static final String MEGA= "mega";


    public String description = "Any Taco";
    public String size = REGULAR;
    public String getDescription(){return description + " " + size;}
    public String getSize(){return size;}
    public abstract double cost() throws Exception;
}
