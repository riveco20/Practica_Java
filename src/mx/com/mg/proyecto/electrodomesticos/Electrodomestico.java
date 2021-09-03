package mx.com.mg.proyecto.electrodomesticos;

public class Electrodomestico {
    protected char comsumo;
    protected String procedencia;

    public Electrodomestico(char comsumo, String procedencia){
        this.comsumo=comsumo;
        this.procedencia=procedencia;

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

    public double precioComsumo(char comsumo){
        this.comsumo=comsumo;
        double precio=0;
            switch (this.comsumo){
            case 'A':precio=450.000;
                     break;
            case 'B':precio=350.000;
                     break;
            case 'C':precio=250.000;
                     break;
            default :
                System.out.println("No se tiene informacion para este consumo");
                System.out.printf("Seleciones A, B o C");
            }

        return precio;
    }

    public double precioProcedencia(String procedencia){
        this.procedencia=procedencia;
        double precio=0;
        if(this.procedencia.equalsIgnoreCase("Nacional")){
            precio=250.000;
        }
        if (this.procedencia.equalsIgnoreCase("Importado")){
            precio=350.000;
        }
        return precio;
    }
}
