package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;
import mx.com.mg.proyecto.productos.Nevera;
import mx.com.mg.proyecto.productos.Televisor;

import java.util.ArrayList;

public class Factura {
    public Nevera nevera = new Nevera();
    public Televisor televisor = new Televisor();
    Electrodomestico electro = new Electrodomestico();

    public Factura() {

    }

    public double compraNevera() {
        double precio = this.nevera.administradoNevera();
        System.out.println(precio);
        return precio;
    }

    public double compraTv() {

        double precio = this.televisor.admistradoTv();
        System.out.println(precio);
        System.out.println("Venta tv");
        return precio;
    }

    public void facturaFinal(ArrayList<Double> nevera, ArrayList<Double> tv) {
        int cantidaNevera = 0;
        int cantidaTv = 0;
        double precioTotalNevera = 0;
        double precioTotalTv = 0;
        for (int i = 0; i < nevera.size(); i++) {
            cantidaNevera += 1;
            precioTotalNevera += nevera.get(i);
        }
        for (int j = 0; j < tv.size(); j++) {
            cantidaTv += 1;
            precioTotalTv += tv.get(j);
        }

        double precioTotalDia = precioTotalNevera + precioTotalTv;
        int totalElectrodomesticos = cantidaTv + cantidaNevera;

        this.electro.factura(cantidaNevera, cantidaTv, precioTotalNevera, precioTotalTv, totalElectrodomesticos, precioTotalDia);
    }

}

