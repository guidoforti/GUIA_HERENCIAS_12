package Main;

import Entidades.P2Electrodomestico;
import Entidades.P2Lavadora;
import Entidades.P2Televisor;

import java.util.ArrayList;

public class P2Main {
    public static void main(String[] args) {


       P2Lavadora  lavadora1 = new P2Lavadora();
       lavadora1.rellenarElectrodomestico();

       P2Televisor tv1 = new P2Televisor();
       tv1.rellenarElectrodomestico();


        ArrayList <P2Electrodomestico> listaDeElectrodomesticos = new ArrayList<>();

        listaDeElectrodomesticos.add(lavadora1);
        listaDeElectrodomesticos.add(tv1);



        Double suma = 0D;
        for (P2Electrodomestico elec : listaDeElectrodomesticos) {


            if (elec instanceof P2Televisor){
                ((P2Televisor) elec).precioFinal();


            }
             if ( elec instanceof  P2Lavadora) {
                 ((P2Lavadora) elec).precioFinal();;

            }
            suma += elec.getPrecio();

            System.out.println(elec);
        }

        System.out.println("el precio final a pagar es de " + suma);





    }
}
