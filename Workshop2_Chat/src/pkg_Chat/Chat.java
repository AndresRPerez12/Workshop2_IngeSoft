
package pkg_Chat;

import java.util.ArrayList;

public class Chat {
    ArrayList <Mensaje> mensajes;
    Persona p1;
    Persona p2;
    
    public Chat(){
        mensajes = new ArrayList<>();
        p1 = null;
        p2 = null;
    }
    
    boolean agregarMensaje( Mensaje m ){
        return mensajes.add(m);
    }
}
