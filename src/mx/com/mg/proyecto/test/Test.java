package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;
import mx.com.mg.proyecto.productos.Nevera;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int opcion=-1;
        while (opcion!=0){
            System.out.println("Menu de venta");
            System.out.println("1. Venta Nevera " + "\n"+
                               "2. Venta Tv");
            int opcion2=consola.nextInt();

            switch (opcion2){
                case 1:
                    System.out.println("Venta nevera");
                    break;
                case 2:
                    System.out.println("Venta tv");
                    break;
                default:
                    System.out.println("Selecione un opcion valida");
                    break;
            }
            System.out.println("Quiere salir marque cero(0) si quieres hacer otra venta marca 1");
            opcion=consola.nextInt();
        }

   }

}
