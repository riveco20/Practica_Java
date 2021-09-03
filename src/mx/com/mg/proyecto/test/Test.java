package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;
import mx.com.mg.proyecto.test.Factura;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Factura fatura = new Factura();
        Scanner consola = new Scanner(System.in);
        ArrayList<Double> preciosNevera = new ArrayList<Double>();
        ArrayList<Double> preciosTv = new ArrayList<Double>();
        int opcion = -1;
        while (opcion != 0) {
            try {
                System.out.println("Menu de venta");
                System.out.println("1. Venta Nevera " + "\n" +
                        "2. Venta Tv");
                Scanner consola2 = new Scanner(System.in);
                int opcion2 = Integer.parseInt(consola2.nextLine());
                switch (opcion2) {
                    case 1:
                        double precio = fatura.compraNevera();
                        preciosNevera.add(precio);
                        break;
                    case 2:
                        double precioTv = fatura.compraTv();
                        preciosTv.add(precioTv);
                        break;
                    default:
                        System.out.println("Selecione un opcion valida");
                        break;
                }
                System.out.println("Quiere salir marque cero(0) si quieres hacer otra venta marca 1");
                opcion = consola.nextInt();
            } catch (Exception ex) {
                System.out.println("Ocurrio un error ingrese una opcion validad");
            }
        }

        fatura.facturaFinal(preciosNevera, preciosTv);
    }

}
