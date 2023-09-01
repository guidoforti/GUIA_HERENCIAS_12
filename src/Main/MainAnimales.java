package Main;
import Entidades.*;

import java.util.ArrayList;

public class MainAnimales {
    public static void main(String[] args) {

        ArrayList <PruebaAnimal> animales = new ArrayList<>();
        PruebaAnimal a = new PruebaAnimal("pepe" , 10);
        PruebaPerro b = new PruebaPerro( "juan" , 12);
        PruebaGato c = new PruebaGato("gato" , 4);

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (PruebaAnimal animal : animales) {
            animal.hacerRuido();
        }
    }
}
