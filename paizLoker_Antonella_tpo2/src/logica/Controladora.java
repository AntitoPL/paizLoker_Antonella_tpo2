package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Anto_PaizLoker
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // alta
    public void altaMascota(Mascota mascota){
        controlPersis.crearMascota(mascota);
    }
    
    public void altaMascota(int nroCliente, String nombre, String raza, String color, boolean alergico, boolean atencion_especial, String observaciones, String nombreDuenio, String celularDuenio){       
        Mascota mascota = new Mascota();
        mascota.setNroCliente(nroCliente);
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion_especial);
        mascota.setNombreDuenio(nombreDuenio);
        mascota.setCelularDuenio(celularDuenio);
        mascota.setObservaciones(observaciones);
        
        controlPersis.crearMascota(mascota);
    }
    
    // baja
    public void bajaMascota(Mascota mascota){
        controlPersis.eliminarMascota(mascota);
    }
    
    public void bajaMascota(int nroCliente){
        controlPersis.eliminarMascota(nroCliente);
    }
    
    // buscar todas
    public List<Mascota> obtenerMascotas(){
        return controlPersis.obtenerMascotas();
    }
    
    // modificar
    public void modificarMascota(Mascota mascota){
        controlPersis.modificarMascota(mascota);
    }
    
    // buscar
    public Mascota buscarMascota(Mascota mascota){
        return controlPersis.buscarMascota(mascota);
    }
    
    public Mascota buscarMascota(int nroCliente){
        return controlPersis.buscarMascota(nroCliente);
    }
}
