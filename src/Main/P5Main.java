package Main;
import Entidades.P5Alquiler;
import Entidades.P5Yate;

import java.time.LocalDate;
import java.util.*;

public class P5Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        P5Yate yate = new P5Yate();

        yate.rellenarBarco();
        yate.calcularModuloMetros();

        System.out.println("ingrese el nombre del propietario del alquiler");
        String nombre = leer.next();
        System.out.println("ingrese su document ");
        Integer dni = leer.nextInt();
        System.out.println("ingrese el anio , mes y dia de la fecha de alquiler  ");
        int anio = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();
        LocalDate fechaAlquilers = LocalDate.of(anio, mes, dia);
        System.out.println("ingrese el anio , mes y dia de la fecha de devolucion  ");
        int anio1 = leer.nextInt();
        int mes1 = leer.nextInt();
        int dia1 = leer.nextInt();
        LocalDate fechaDev = LocalDate.of(anio1, mes1, dia1);
        System.out.println("ingrese la posicion del amarre");
        Integer amarre = leer.nextInt();


        P5Alquiler alquiler = new P5Alquiler(nombre, dni, fechaAlquilers, fechaDev , amarre, yate);
        alquiler.calcularPrecioAlquiler();

        System.out.println(alquiler.getPrecio());


    }
}
