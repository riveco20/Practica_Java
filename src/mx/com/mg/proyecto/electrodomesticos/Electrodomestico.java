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

    public double precioComsumo(){
            double precio=0;
            switch (this.comsumo){
            case 'A':precio=450000;
                     break;
            case 'B':precio=350000;
                     break;
            case 'C':precio=250000;
                     break;
            default :
                System.out.println("No se tiene informacion para este consumo");
                System.out.printf("Seleciones A, B o C");
            }

        return precio;
    }

    public double precioProcedencia(){
          double precio=0;
        if(this.procedencia.equalsIgnoreCase("Nacional")){
            precio=250000;
        }
        if (this.procedencia.equalsIgnoreCase("Importado")){
            precio=350000;
        }
        return precio;
    }


    public double precioInicial(){
        double precioComsumo=this.precioComsumo();
        double precioProcedencia=this.precioProcedencia();
        double precio = precioComsumo +precioProcedencia;
        return precio;

    }
}
