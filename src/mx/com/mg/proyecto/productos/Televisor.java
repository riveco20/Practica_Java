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

    public double precioTv(){
        double precio=0;
        double precioFinal=0;
        double valorAumentado=0;
        if(this.sincronizacionTDT==true){
            if(this.tamaño>40){
                precio=this.precioInicial();
                valorAumentado=(precio*0.30)+250000;
                precioFinal=precio+valorAumentado;
            }

            else {
                precioFinal=precioInicial();
            }

        }

        else {
            if(this.tamaño>40){
                precio=this.precioInicial();
                valorAumentado=(precio*0.30);
                precioFinal=precio+valorAumentado;

            }
            else {
                precioFinal=precioInicial();
            }
        }
        return precioFinal;
    }


}
