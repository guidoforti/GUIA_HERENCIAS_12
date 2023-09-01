package Servicios;

import Entidades.P2Electrodomestico;
import Entidades.P2Televisor;

import java.util.Scanner;

public class P2SvTelevisor extends P2SvElectrodomestico {

    Scanner leer = new Scanner(System.in);


    public P2Televisor crearTelevisor () {

        P2Electrodomestico electrodomestico = super.rellenarElectrodomestico();

        System.out.println("ingrese la resolucion del televisor");
        Double resolucion = leer.nextDouble();
        System.out.println("ahora ingrese S si el televisor tiene sintonizador o F si no");
        String opcion = leer.next();
        boolean sintonizador = false;
        switch ( opcion) {
                case "V":
                case "v":
                    sintonizador = true;

            case "F":
            case "f":
                sintonizador = false;
        }


        P2Televisor tv = new P2Televisor(electrodomestico.getPrecio() , electrodomestico.getColor() , electrodomestico.getPeso() ,  electrodomestico.getConsumoEnergetico() ,resolucion, sintonizador);
        return tv;
    }


}
