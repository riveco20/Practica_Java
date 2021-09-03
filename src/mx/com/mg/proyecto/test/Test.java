package mx.com.mg.proyecto.test;

import mx.com.mg.proyecto.electrodomesticos.Electrodomestico;
import mx.com.mg.proyecto.productos.Nevera;

public class Test {
    public static void main(String[] args) {
      Nevera nevera1= new Nevera('A',"Nacional",-125);
      nevera1.precioNevera();
      double precio=nevera1.precioInicial();
        System.out.println(precio);

    }

}
