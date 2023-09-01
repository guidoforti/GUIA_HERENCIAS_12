package Servicios;

import Entidades.P1Caballo;
import Entidades.P1Perro;

import java.util.Scanner;

public class P1SCaballo extends P1SAnimal {

    P1Caballo caballo = new P1Caballo();
    Scanner leer = new Scanner(System.in);

    @Override

    public void rellenarAnimal() {

        System.out.println("ingrese el nombre, el alimento, la edad y la raza del caballo ");

        String nombre = leer.next();
        String alimento = leer.next();
        Integer edad = leer.nextInt();
        String raza = leer.next();
        caballo.setAlimento(alimento);
        caballo.setNombre(nombre);
        caballo.setEdad(edad);
        caballo.setRaza(raza);
    }

    @Override
    public String DeQueSeAlimenta() {

        return caballo.getAlimento();
    }

    ;
}
