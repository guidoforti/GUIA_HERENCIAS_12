package Entidades;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class P5Alquiler {

    private String nombre;
    private Integer documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    private Integer posicionAmarre;

    private P5Barco barco;

    private Double precio;

    public P5Alquiler(String nombre, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, P5Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public P5Barco getBarco() {
        return barco;
    }

    public void setBarco(P5Barco barco) {
        this.barco = barco;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void calcularPrecioAlquiler() {

        //Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        //alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
        //multiplicando por 10 los metros de eslora).
        Double diferenciaEnDias = (double) ChronoUnit.DAYS.between( this.fechaAlquiler, this.fechaDevolucion);
        Double alquiler = diferenciaEnDias + (this.barco.getMetros()* 10) ;

        setPrecio(alquiler);


    }
}
