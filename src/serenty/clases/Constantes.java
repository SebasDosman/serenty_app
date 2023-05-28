/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serenty.clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sebastián Dosman
 */
public class Constantes {
    public static boolean validarCorreo(String correo) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mat = patron.matcher(correo);
        
        return mat.find();
    }
    
    public static boolean validarNombre(String nombre) {
        Pattern patron = Pattern.compile("^[A-Z][a-zñáéíóú]+$");
        
        Matcher mat = patron.matcher(nombre);
        
        return mat.find();
    }
}
