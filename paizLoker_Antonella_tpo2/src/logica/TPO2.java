package logica;

import igu.Pantalla;

/**
 *
 * @author Anto_PaizLoker
 */
public class TPO2 {
    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Pantalla principal = new Pantalla(control);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
    
}
