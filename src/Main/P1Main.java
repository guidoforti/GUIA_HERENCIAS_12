package Main;

import Servicios.P1SAnimal;
import Servicios.P1SCaballo;
import Servicios.P1SGato;
import Servicios.P1SPerro;

public class P1Main  {
    public static void main(String[] args) {

        P1SAnimal svA = new P1SAnimal();
        P1SCaballo svC = new P1SCaballo();
        P1SGato svG = new P1SGato();
        P1SPerro svP = new P1SPerro();

        svC.rellenarAnimal();
        System.out.println("el caballo se alimenta de " + svC.DeQueSeAlimenta());

        svG.rellenarAnimal();
        System.out.println("el gato se alimenta de " + svG.DeQueSeAlimenta());

        svP.rellenarAnimal();
        System.out.println("el perro se alimenta de " + svP.DeQueSeAlimenta());
    }
}
