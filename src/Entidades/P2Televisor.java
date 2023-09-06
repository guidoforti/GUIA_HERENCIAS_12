package Entidades;

public class P2Televisor extends P2Electrodomestico {

    private Double resolucion;
    private boolean sintonizador;

    public P2Televisor(Double precio, String color, Double peso, Consumo consumo, Double resolucion, boolean sintonizador) {
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


    @Override

    public void rellenarElectrodomestico (){
        super.rellenarElectrodomestico();

        System.out.println("ingrese la resolucion del televisor");
        this.resolucion = leer.nextDouble();
        System.out.println("ahora ingrese S si el televisor tiene sintonizador o F si no");
        String opcion = leer.next();

        switch (opcion) {
            case "V":
            case "v":
                this.sintonizador = true;
                break;

            case "F":
            case "f":
                this.sintonizador = false;
                break;
        }

    }

    @Override

    public void precioFinal () {
        super.precioFinal();


        if ( this.resolucion >= 40 && this.sintonizador == true) {
            this.precio +=  (this.precio * 0.3) + 500;
        } else if (this.resolucion >= 40 &&  this.sintonizador != true) {
            this.precio += (this.precio * 0.3);

        } else if ( this.resolucion  <= 40 && this.sintonizador == true) {
            this.precio +=  500;
        }



    }


    @Override
    public String toString() {
        return "P2Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizador=" + sintonizador +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
