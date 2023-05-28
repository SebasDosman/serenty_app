/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serenty.clases;

/**
 *
 * @author Sebastián Dosman
 */
public class Contador {
    private static Contador instancia;
    
    private int valor;

    private Contador() {
        valor = 0;
    }

    public static Contador getInstance() {
        if (instancia == null) {
            instancia = new Contador();
        }
        
        return instancia;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }
}
