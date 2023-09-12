package Entidades;

public class P4Circuloo implements P4calculoFormas {

    private double radio;
    private double diametro;

    private double perimetro;
    private double area;

    public P4Circuloo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
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

        perimetro = PI * this.diametro;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area;

        area = PI * (Math.pow(this.radio, 2));
        return area;
    }

    @Override
    public String toString() {
        return "P4Cuadrado{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
