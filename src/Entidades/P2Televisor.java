package Entidades;

public class P2Televisor extends P2Electrodomestico {

    private Double resolucion;
    private boolean sintonizador;

    public P2Televisor(Integer precio, String color, Double peso, Consumo consumo, Double resolucion, boolean sintonizador) {
        super(precio, color, peso, consumo);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public P2Televisor() {

    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
}
