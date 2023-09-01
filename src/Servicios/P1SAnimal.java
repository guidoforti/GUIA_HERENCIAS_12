package Servicios;

import Entidades.P1Animal;

import java.util.Scanner;

public class P1SAnimal  {


    Scanner leer = new Scanner(System.in);
    P1Animal animal = new P1Animal();

    protected void rellenarAnimal() {

        System.out.println("ingrese el nombre, el alimento, la edad y la raza del animal ");

        String nombre = leer.next();
        String alimento = leer.next();
        Integer edad = leer.nextInt();
        String raza = leer.next();
        animal.setAlimento(alimento);
        animal.setNombre(nombre);
        animal.setEdad(edad);
        animal.setRaza(raza);
    }


    protected String DeQueSeAlimenta( ) {

        return "";
    }

    ;

}
