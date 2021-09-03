package mx.com.mg.proyecto.electrodomesticos;

public class Electrodomestico {
    protected char comsumo;
    protected String procedencia;

    public Electrodomestico() {

    }

    public char getComsumo() {
        return this.comsumo;
    }

    public void setComsumo(char comsumo) {
        this.comsumo = comsumo;
    }

    public String getProcedencia() {
        return this.procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double precioComsumo(char comsumo) {
        double precio = 0;
        this.comsumo = comsumo;
        switch (this.comsumo) {
            case 'A':
                precio = 450000;
                break;
            case 'B':
                precio = 350000;
                break;
            case 'C':
                precio = 250000;
                break;
            default:
                System.out.println("No se tiene informacion para este consumo");
                System.out.printf("Seleciones A, B o C");
        }

        return precio;
    }

    public double precioProcedencia(String procedencia) {
        double precio = 0;
        this.procedencia = procedencia;
        if (this.procedencia.equalsIgnoreCase("Nacional")) {
            precio = 250000;
        } else if (this.procedencia.equalsIgnoreCase("Importado")) {
            precio = 350000;
        }
        return precio;
    }


    public double precioInicial(char comsumo, String procedencia) {
        double precioComsumo = this.precioComsumo(comsumo);
        double precioProcedencia = this.precioProcedencia(procedencia);
        double precio = precioComsumo + precioProcedencia;
        return precio;

    }

    public void factura(int contadorNevera, int contadorTv, double precioTotalNevera, double precioTotalTv, int totalElectrodomesticos, double precioTatalDelDia) {
        System.out.println("Factura Electronica" + "\n" + "Total de neveras: " + contadorNevera + " Precio total " + precioTotalNevera
                + "\n" + "Total de tv: " + contadorTv + " precio total "
                + precioTotalTv + "\n" + "Total electrodomesticos " + totalElectrodomesticos + " Precio Total dia: " + precioTatalDelDia);

    }
}
