
package pkg_Chat;

public class Mensaje {
    Persona p;
    String texto;

    public Mensaje(Persona p, String texto) {
        this.p = p;
        this.texto = texto;
    }
    
    public String toString(){
        String ret = p.nombre + ": " + texto;
        return ret;
    }
    
}
