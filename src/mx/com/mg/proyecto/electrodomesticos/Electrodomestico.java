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


}
