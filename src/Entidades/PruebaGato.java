package Entidades;

public class PruebaGato extends PruebaAnimal {


    public PruebaGato(String nombre, Integer edad) {

        super(nombre, edad);
    }


    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
