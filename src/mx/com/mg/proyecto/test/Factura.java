package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.productos.Nevera;
import mx.com.mg.proyecto.productos.Televisor;

import java.util.ArrayList;

public class Factura {
    public Nevera nevera;
    public Televisor televisor;

    public Factura(){

    }

    public double compraNevera(){
        double precio = nevera.administradoNevera();
        System.out.println(precio);
        return precio;
    }

    public double compraTv(){

        double precio = televisor.admistradoTv();
        System.out.println(precio);
        System.out.println("Venta tv");
        return precio;
    }

    public void facturaFinal(ArrayList nevera, ArrayList tv){
        int cantidaNevera=0;
        int cantidaTv=0;
        int pricioTotalNevera=0;
        for(int i= 0; i <nevera.size();i++ ){
            for(int j = 0; j<tv.size();i++ ){
                cantidaNevera+=i;
                cantidaTv+=i;
                System.out.println(ne);
            }
        }

    }
}
