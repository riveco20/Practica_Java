package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.*;
import java.util.ArrayList;

public class Nevera extends Electrodomestico {
    public int capacidad;
    public ArrayList<Double> precios = new ArrayList<Double>();

    public Nevera(char comsumo, String procedencia, int capacidad) {
        super(comsumo, procedencia);
        this.capacidad = capacidad;
    }

    public void precioNevera() {
        double precio = 0;
        double precioFinal = 0;
        if(this.capacidad>0) {
            if (this.capacidad > 120) {
                int capacidaDeMas = this.capacidad - 120;
                precio = this.precioInicial();
                precioFinal = precio + ((precio * 0.05) * capacidaDeMas);

            } else {
                precioFinal = this.precioInicial();

            }
             }
        else {
            System.out.println("La capacidad no puede ser negatica");
        }    }

    public void totalNevera(){
        int totalVenta=this.precios.size();
        System.out.println(totalVenta);
    }




}