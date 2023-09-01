package Entidades;

public class PruebaAnimal {

    protected String nombre;
    protected Integer edad;

    public PruebaAnimal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void hacerRuido() {
        System.out.println("hola");
    }
}
