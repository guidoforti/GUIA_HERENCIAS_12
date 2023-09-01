package Entidades;

public class P2Lavadora  extends P2Electrodomestico{

private Integer carga;


public P2Lavadora () {} ;

public P2Lavadora (Integer precio, String color, Double peso, Integer consumo , Integer carga) {
    super(precio, color, peso, consumo);
    this.carga = carga;
} ;

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
}
