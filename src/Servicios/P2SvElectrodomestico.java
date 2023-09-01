package Servicios;
import java.util.*;

import Entidades.Consumo;
import Entidades.P2Electrodomestico;

public abstract  class P2SvElectrodomestico {

Scanner leer = new Scanner(System.in);



    protected P2Electrodomestico rellenarElectrodomestico () {


        System.out.println("ingrese el precio del electrodomestico");

        Integer precio  = leer.nextInt();
        System.out.println("ahora ingrese su color");
        String color = leer.next();
        System.out.println("cuanto pesa el electrodomestico?");
        Double peso = leer.nextDouble();
        System.out.println(" ingrese 1 para Coonsumo A \n ingrese 2 Para consumo B \n ingrese 3 Para consumo C \n ingrese 4 para consumo D \n ingrese 5 para consumo E \n ingrese 6 para consumo F");
        Integer num = leer.nextInt() ;
        Consumo consumo = Consumo.values() [num];
         P2Electrodomestico electrodomestico = new P2Electrodomestico(precio, color ,peso , consumo);
         return electrodomestico;
    }


    //LOS SERVICIOS VAN A RECIBIR ENTONCES COMO PARAMETRO LOS QUE NECESITEN UN ELECTRODOMESTICO DESDE EL MAIN, L OMISMO EN LOS OTROS SV PERO OTR COSA.

}
