package mx.com.mg.proyecto.productos;

import mx.com.mg.proyecto.electrodomesticos.*;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;
public class Nevera extends Electrodomestico {
    public int capacidad;
    public ArrayList<Double> precios = new ArrayList<Double>();
    public Scanner consola=new Scanner(System.in);
    public Nevera() {
           }

    public double precioNevera(char comsumo, String procedencia, int litros) {
        double precio = 0;
        double precioFinal = 0;
        this.capacidad=litros;
        if (this.capacidad > 0) {
            if (this.capacidad > 120) {
                int capacidaDeMas = this.capacidad - 120;
                precio = this.precioInicial(comsumo, procedencia);
                precioFinal = precio + ((precio * 0.05) * capacidaDeMas);

            } else {
                precioFinal = this.precioInicial(comsumo,procedencia);

            }
        } else {
            System.out.println("La capacidad no puede ser negatica");
        }
        return (precioFinal);
    }

    public double administradoNevera(){
        Scanner consola2= new Scanner(System.in);
        System.out.println("Ingrese la procedenica");
        String procencia = consola2.nextLine();
        System.out.printf("Ingrese los litros"+"\n:");
        int litros=this.consola.nextInt();
        System.out.printf("Ingrese el comsumo" + "\n:");
        char comsumo = this.consola.next().charAt(0);
        double precio=this.precioNevera(comsumo,procencia,litros);
        return precio;
    }

}