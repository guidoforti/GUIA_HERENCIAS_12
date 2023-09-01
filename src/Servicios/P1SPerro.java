package Servicios;

import Entidades.P1Animal;
import Entidades.P1Perro;

import java.util.*;

public class P1SPerro extends P1SAnimal {



    Scanner leer = new Scanner(System.in);
    P1Perro perro = new P1Perro();

    @Override
    public void rellenarAnimal() {

        System.out.println("ingrese el nombre, el alimento, la edad y la raza del perro ");

        String nombre = leer.next();
        String alimento = leer.next();
        Integer edad = leer.nextInt();
        String raza = leer.next();
        perro.setAlimento(alimento);
        perro.setNombre(nombre);
        perro.setEdad(edad);
        perro.setRaza(raza);

    }

    @Override
    public String DeQueSeAlimenta( ) {
        return perro.getAlimento();
    }
}
