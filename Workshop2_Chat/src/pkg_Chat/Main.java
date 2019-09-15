
package pkg_Chat;

import java.util.ArrayList;


public class Main {
    
    public static Chat chat;
    
    // Vector de las Ventanas de las Personas en el Chat
    public static ArrayList<Ventana_Chat> ventanas;
    
    public static void main(String args[]) {
        chat = new Chat();
        ventanas = new ArrayList<>();
        // Abre la ventana de Registro de Nombre
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Inicio(chat).setVisible(true);
            }
        });
    }
    
    // Función que actualiza los mensajes para todas la ventanas en el Chat
    public static void refresh(){
        for( int i = 0 ; i < ventanas.size() ; i ++ ){
            ventanas.get(i).refresh();
        }
    }
}
