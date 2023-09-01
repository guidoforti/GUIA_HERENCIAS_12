package Servicios;

import Entidades.P1Caballo;
import Entidades.P1Gato;

import java.util.Scanner;

public class P1SGato extends P1SAnimal {

    P1Gato gato = new P1Gato();
    Scanner leer = new Scanner(System.in);

    @Override
    public void rellenarAnimal() {

        System.out.println("ingrese el nombre, el alimento, la edad y la raza del gato ");

        String nombre = leer.next();
        String alimento = leer.next();
        Integer edad = leer.nextInt();
        String raza = leer.next();
        gato.setAlimento(alimento);
        gato.setNombre(nombre);
        gato.setEdad(edad);
        gato.setRaza(raza);
    }

    @Override
    public String DeQueSeAlimenta() {

        return gato.getAlimento();
    }

    ;
}

