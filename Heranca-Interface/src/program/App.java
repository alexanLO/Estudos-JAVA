package program;

import models.entities.Shape;
import models.entities.figure.Cicle;
import models.entities.figure.Rectangle;
import models.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        
        Shape retangulo = new Rectangle(Color.BLACK, 14.0, 17.9);
        Shape retangulo2 = new Rectangle(20.0, 25.0);
        Shape circulo = new Cicle(Color.WHITE, 16);
        Shape circulo2 = new Cicle(20);


        System.out.println( retangulo + " Area: " + retangulo.area());
        System.out.println(retangulo2 + " Area: " + retangulo2.area());
        System.out.println(circulo + " Area: " + circulo.area());
        System.out.println(circulo2 + " Area: " + circulo2.area());


    }
}
