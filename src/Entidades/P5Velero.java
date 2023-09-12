package Entidades;

public final class P5Velero  extends  P5Barco{


    private Integer numeroMastiles;


    public P5Velero () {

    }
    public P5Velero(String matricula, Double metros, Integer anioFabricacion, Integer numeroMastiles) {
        super(matricula, metros, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }



    @Override

    protected void rellenarBarco () {
        super.rellenarBarco();
        System.out.println("ingrese la cantidad de mastiles que tiene el velero");
        this.numeroMastiles = leer.nextInt();
    }
    @Override
    protected void calcularModuloMetros() {

        Double moduloVelero = this.metros + numeroMastiles;

        setMetros(moduloVelero);

    }
}
