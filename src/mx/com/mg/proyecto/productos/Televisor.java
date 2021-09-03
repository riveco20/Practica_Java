package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;

import java.util.ArrayList;

public class Televisor extends Electrodomestico {

    public double tamaño;
    public boolean sincronizacionTDT;
    public ArrayList<Double> precios;

    public Televisor(char comsumo, String procedencia, double tamaño, boolean sincronizacionTDT) {
        super(comsumo, procedencia);
        this.tamaño = tamaño;
        this.sincronizacionTDT = sincronizacionTDT;
    }

    public void precioTv(){
        if(this.sincronizacionTDT==true){
            if(this.tamaño>42){

            }
        }
    }


}
