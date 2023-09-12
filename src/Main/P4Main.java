package Main;

import Entidades.P4Circuloo;
import Entidades.P4Rectangulo;

import java.util.*;

public class P4Main {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el radio y el diametro de un ciruclo");
        double radio = leer.nextDouble();

        double diametro = leer.nextDouble();

        P4Circuloo circulo = new P4Circuloo(radio , diametro);

        circulo.setArea( circulo.calcularArea());
        circulo.setPerimetro(circulo.calcularPerimetro());

        System.out.println(circulo);

        System.out.println("-----------------------------------------");

        System.out.println("");
        System.out.println("ahora ingrese la base y la altura de un rectangulo");
        double base= leer.nextDouble();

        double altura = leer.nextDouble();

        P4Rectangulo rectangulo = new P4Rectangulo(base , altura);

        rectangulo.setArea(rectangulo.calcularArea());
        rectangulo.setPerimetro(rectangulo.calcularPerimetro());

        System.out.println(rectangulo);
    }
}
