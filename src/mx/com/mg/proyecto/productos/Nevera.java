package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;

import java.util.ArrayList;

public class Nevera extends Electrodomestico {
    public int capacidad;
    public ArrayList<Double> precios;

    public Nevera(char comsumo, String procedencia, int capacidad) {
        super(comsumo, procedencia);
        this.capacidad = capacidad;
    }

    public void precioNevera() {
        double precio = 0;
        double precioFinal = 0;
        if (this.capacidad > 120) {
            int capacidaDeMas = this.capacidad - 120;
            precio = this.precioInicial();
            precioFinal = precio + ((precio * 0.05) * capacidaDeMas);
        } else {
            precio = this.precioInicial();
        }
    }

    public double precioInicial(){
        double precioComsumo=this.precioComsumo();
        double precioProcedencia=this.precioProcedencia();
        double precio = precioComsumo +precioComsumo;
        return precio;
    }
}