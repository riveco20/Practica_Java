package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;

import java.util.ArrayList;

public class Nevera extends Electrodomestico {
    public int capacidad;
    public boolean sintonizadorTDT;
    public ArrayList<Double> precios;

    public Nevera(char comsumo, String procedencia, int capacidad, boolean sintonizadorTDT) {
        super(comsumo, procedencia);
        this.capacidad = capacidad;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void precioNevera() {
        double precio = 0;
        if (this.sintonizadorTDT == true) {
            if (this.capacidad > 120) {
                int capacidaDeMas = this.capacidad - 120;

            }

        }
    }
}