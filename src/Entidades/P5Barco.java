package Entidades;
import java.util.*;
public  class P5Barco {

    Scanner leer = new Scanner(System.in);
    protected  String matricula;
    protected  Double metros;
    protected  Integer anioFabricacion;


    public P5Barco(String matricula, Double metros, Integer anioFabricacion) {
        this.matricula = matricula;
        this.metros = metros;
        this.anioFabricacion = anioFabricacion;



    }

    public P5Barco() {

    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getMetros() {
        return metros;
    }

    public void setMetros(Double metros) {
        this.metros = metros;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }


    protected void rellenarBarco () {
        System.out.println("ingrese la matricula del barco");
        this.matricula = leer.next();
        System.out.println("ingrese los metros del barco");
        this.metros = leer.nextDouble();
        System.out.println("por ultimo ingrese el anio que se fabrico el barco");
        this.anioFabricacion = leer.nextInt();
    };
    protected  void calcularModuloMetros () {

    };


}
