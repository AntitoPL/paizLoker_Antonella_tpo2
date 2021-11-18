package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Anto_PaizLoker
 */
public class ControladoraPersistencia {
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    // métodos de creación
    public void crearMascota(Mascota mascota){
        try{
            mascotaJPA.create(mascota);
        }catch (Exception e){
            System.out.println("No se pudo crear el Cliente");
        }
    }
    
    // métodos de baja
    public void eliminarMascota(int nroCliente){
        try {
            mascotaJPA.destroy(nroCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarMascota(Mascota mascota){
        try {
            mascotaJPA.destroy(mascota.getIdCliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // métodos de lectura
    public List<Mascota> obtenerMascotas(){
        return mascotaJPA.findMascotaEntities();
    }

    // métodos de modificación
    public void modificarMascota(Mascota mascota){
        try {
            mascotaJPA.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // métodos de búsqueda
    public Mascota buscarMascota(int nroCliente){
        return mascotaJPA.findMascota(nroCliente);
    }
    
    public Mascota buscarMascota(Mascota mascota){
        return mascotaJPA.findMascota(mascota.getIdCliente());
    }
    
}
