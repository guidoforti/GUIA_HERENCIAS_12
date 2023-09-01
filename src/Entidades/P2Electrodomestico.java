package Entidades;

public  class P2Electrodomestico {

    protected Integer precio;
    protected String color;
    protected Double peso;
    protected Consumo consumoEnergetico ;


    public P2Electrodomestico(Integer precio, String color, Double peso, Consumo consumo)  {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumo;
    }

    public P2Electrodomestico() {
    }

    ;

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Consumo getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Consumo consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}

