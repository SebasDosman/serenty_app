/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serenty.clases;

/**
 *
 * @author juanpablotr14
 */
public class UsuarioActivo {
    private static UsuarioActivo instancia;
    
    private int idUsuario;
    
    private UsuarioActivo() {
    }
    
    public static UsuarioActivo getInstance() {
        if (instancia == null) {
            instancia = new UsuarioActivo();
        }
        
        return instancia;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
