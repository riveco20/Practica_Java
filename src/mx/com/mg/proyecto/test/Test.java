package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;
import mx.com.mg.proyecto.productos.Nevera;
import mx.com.mg.proyecto.productos.Televisor;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Nevera nevera = new Nevera();
        Televisor televisor = new Televisor();
        ArrayList<Double>preciosNevera= new ArrayList<Double>();
        ArrayList<Double>preciosTv = new ArrayList<Double>();
        int opcion = -1;
        while (opcion != 0)
            try {
                System.out.println("Menu de venta");
                System.out.println("1. Venta Nevera " + "\n" +
                        "2. Venta Tv");
                int opcion2 = consola.nextInt();
                Scanner consola2 = new Scanner(System.in);
                switch (opcion2) {
                    case 1:
                        double precio = nevera.administradoNevera();
                        System.out.println(precio);
                        preciosNevera.add(precio);
                        break;
                    case 2:
                        double precioTv = televisor.admistradoTv();
                        System.out.println(precioTv);
                        System.out.println("Venta tv");
                        preciosTv.add(precioTv);
                        break;
                    default:
                        System.out.println("Selecione un opcion valida");
                        break;
                }
                System.out.println("Quiere salir marque cero(0) si quieres hacer otra venta marca 1");
                opcion = consola.nextInt();
            }catch (Exception ex){
                System.out.println("Ocurrio un error ingresa numero no letras");
                System.out.println("Vuelve a elegir una opcion ");
                opcion=consola.nextInt();
    }
        System.out.println(preciosNevera);
        System.out.println(preciosTv);
   }

}
