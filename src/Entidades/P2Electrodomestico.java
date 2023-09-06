package Entidades;
import java.util.*;
public  class P2Electrodomestico {

    Scanner leer = new Scanner(System.in);
    protected Double precio;
    protected String color;
    protected Double peso;
    protected Consumo consumoEnergetico ;


    public P2Electrodomestico(Double precio, String color, Double peso, Consumo consumo)  {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumo;
    }

    public P2Electrodomestico() {
    }

    ;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Consumo consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }



    protected void rellenarElectrodomestico () {
        System.out.println("ingrese  el color ,y  el peso ");
        this.precio = 1000D;
        this.color = leer.next();
        this.peso = leer.nextDouble();
        System.out.println("ingrese 1 para consumo A \n 2 para consumo B \n 3 para consumo C \n 4 para consumo D \n 5 para consumo E \n 6 para consumo F");
        int cons = leer.nextInt() -1;
        this.consumoEnergetico = Consumo.values() [cons];
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);





    }

    protected void comprobarConsumoEnergetico(Consumo consumo) {

        for (int i = 0; i < Consumo.values().length; i++) {
            if (consumo == Consumo.values()[i]) {
                this.consumoEnergetico = consumo;
                break;
            }
            else  {
                this.consumoEnergetico = Consumo.F;
            }
        }

    }

    protected void comprobarColor(String color) {

        switch (color) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
            default:
                this.color = "blanco";
        }

    }





    protected void precioFinal() {


        double precioPeso = 0;
        double precioConsumo = 0;

        switch (consumoEnergetico) {
            case A:
                precioConsumo = 1000;
                break;
            case B:
                precioConsumo = 800;
                break;
            case C:
                precioConsumo = 600;
                break;
            case D:
                precioConsumo = 500;
                break;
            case E:
                precioConsumo = 300;
                break;
            case F:
                precioConsumo = 100;
                break;
        }

        if ( peso >= 1 && peso <= 19) {
            precioPeso = 100;

        } else if (peso >= 20 && peso <= 49) {
            precioPeso = 500;
        } else if (peso >= 50 && peso<= 79) {
            precioPeso = 800;
        }
        else {
            precioPeso = 1000;
        }

        this.precio += precioConsumo + precioPeso ;


    }



}

