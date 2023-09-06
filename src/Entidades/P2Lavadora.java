package Entidades;

public class P2Lavadora  extends P2Electrodomestico{

private Integer carga;


public P2Lavadora () {} ;

public P2Lavadora (Double precio, String color, Double peso, Consumo consumo , Integer carga) {
    super(precio, color, peso, consumo);
    this.carga = carga;
} ;

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override

    public void rellenarElectrodomestico (){
        super.rellenarElectrodomestico();

        System.out.println("ingrese la carga de la lavadora");

        this.carga = leer.nextInt();

    }

    @Override
    public void precioFinal () {
        super.precioFinal();

        if (this.carga >= 30) {
            this.precio = precio + 500;
        }
    }


    @Override
    public String toString() {
        return "P2Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
