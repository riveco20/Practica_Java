package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;

import java.util.ArrayList;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    public double tamaño;
    public boolean sincronizacionTDT;
    public ArrayList<Double> precios;
    public Scanner consola = new Scanner(System.in);

    public Televisor() {

    }

    public double precioTv(char comsumo, String procedencia, double pulgadas, boolean sincronizacionTDT){
        double precio=0;
        double precioFinal=0;
        double valorAumentado=0;
        this.sincronizacionTDT=sincronizacionTDT;
        this.tamaño=pulgadas;
        if(this.sincronizacionTDT==true){
            if(this.tamaño>40){
                precio=this.precioInicial(comsumo, procedencia);
                valorAumentado=(precio*0.30)+250000;
                precioFinal=precio+valorAumentado;
            }
            else {
                precioFinal=precioInicial(comsumo,procedencia)+250000;
            }

        }

        else {
            if(this.tamaño>40){
                precio=this.precioInicial(comsumo,procedencia);
                valorAumentado=(precio*0.30);
                precioFinal=precio+valorAumentado;

            }
            else {
                precioFinal=precioInicial(comsumo,procedencia);
            }
        }

         return (precioFinal);
    }

    public double admistradoTv(){
        Scanner consola2 = new Scanner(System.in);
        System.out.println("Ingrese la procedenica");
        String procencia2 = consola2.nextLine();
        System.out.printf("Ingrese los pulgadas"+"\n:");
        double pulgadas=consola.nextInt();
        System.out.printf("Ingrese el comsumo" + "\n:");
        char comsumo2 = consola.next().charAt(0);
        System.out.println("Tiene sincronizacion TDT (true: si) o (false: no)");
        boolean sincronizacion=Boolean.parseBoolean(consola2.nextLine());
        double precioTv=this.precioTv(comsumo2,procencia2,pulgadas,sincronizacion);
        return precioTv;
    }

}
