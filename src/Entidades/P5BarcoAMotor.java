package Entidades;

public class P5BarcoAMotor extends P5Barco {


    private Integer potencia ;


    public P5BarcoAMotor () {

    }
    public P5BarcoAMotor(String matricula, Double metros, Integer anioFabricacion, Integer potencia) {
        super(matricula, metros, anioFabricacion);
        this.potencia = potencia;
    }



    @Override
    public   void rellenarBarco () {
        super.rellenarBarco();
        System.out.println("ingrese la potencia del barco a motor");
        this.potencia = leer.nextInt();
    }

    @Override
    protected void calcularModuloMetros() {

        Double moduloMotor = this.metros + this.potencia;

        setMetros(moduloMotor);

    }
}
