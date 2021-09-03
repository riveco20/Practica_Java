package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;

public class Televisor extends Electrodomestico {
    public double tamaño;
    public boolean sintonizadorTDT;

    public Televisor(char comsumo, String procedencia, double tamaño, boolean sintonizadorTDT) {
        super(comsumo, procedencia);
        this.tamaño = tamaño;
        this.sintonizadorTDT = sintonizadorTDT;
    }


}
