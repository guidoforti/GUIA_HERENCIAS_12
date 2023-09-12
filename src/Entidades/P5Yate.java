package Entidades;

public class P5Yate extends  P5Barco {

    private Integer potencia ;
    private Integer numeroCamarotes;


    public P5Yate () {


    };
    public P5Yate(String matricula, Double metros, Integer anioFabricacion, Integer potencia, Integer numeroCamarotes) {
        super(matricula, metros, anioFabricacion);
        this.potencia = potencia;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public void rellenarBarco (){
        super.rellenarBarco();
        System.out.println("ingrese la potencia del yate");
        this.potencia = leer.nextInt();
        System.out.println("ingrese el numero de camarotes");
        this.numeroCamarotes = leer.nextInt();

    }

    @Override
    public void calcularModuloMetros() {

        Double moduloYate = this.metros + this.potencia +this.numeroCamarotes;

        setMetros(moduloYate);
    }


    @Override
    public String toString() {
        return "el yate tiene " +
                " una potencia=" + potencia +
                ", cantidad de camarotes =" + numeroCamarotes +
                ", su matricula es ='" + matricula + '\'' +
                ", tiene cantidad de metros =" + metros +
                ", su anio de fabricacion es =" + anioFabricacion +
                '}';
    }
}
