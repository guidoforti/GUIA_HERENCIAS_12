package Entidades;

public class P4Rectangulo implements P4calculoFormas {
    private double base;
    private double altura;

    private double perimetro;
    private double area;

    public P4Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;

        perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area;

        area = this.base * this.altura;
        return area;
    }

    @Override
    public String toString() {
        return " el rectangulo tiene :" +
                "base=" + base +
                ", altura=" + altura +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
