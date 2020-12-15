
package Class;

public class Parq {
    
    
    String NumPlaca,Tipo,HEntrada,HSalida,Nombre;

    public Parq(String NumPlaca, String Tipo, String HEntrada, String HSalida, String Nombre) {
        this.NumPlaca = NumPlaca;
        this.Tipo = Tipo;
        this.HEntrada = HEntrada;
        this.HSalida = HSalida;
        this.Nombre = Nombre;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getHEntrada() {
        return HEntrada;
    }

    public void setHEntrada(String HEntrada) {
        this.HEntrada = HEntrada;
    }

    public String getHSalida() {
        return HSalida;
    }

    public void setHSalida(String HSalida) {
        this.HSalida = HSalida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
}