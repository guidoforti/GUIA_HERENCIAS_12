package Entidades;

public class PruebaPerro extends PruebaAnimal {


    public PruebaPerro(String nombre, Integer edad) {
        super(nombre, edad);
    }


    @Override
    public void hacerRuido() {
        System.out.println("guau");
    }
}
