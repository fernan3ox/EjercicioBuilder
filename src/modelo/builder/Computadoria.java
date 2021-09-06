/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

import modelo.Computadora;

/**
 *
 * @author Fernandito
 */
public class Computadoria {
    private ComputadoraBuilder builder;

    public void setBuilder(ComputadoraBuilder builder) {
        this.builder = builder;
    }
    
    public Computadora getCompucomputadora(){
        return builder.getCompu();
        
    }
    public void darCompuComputadora(){
        builder.crearCompu();
        builder.builMarca();
        builder.buildProcesador();
        builder.buildmemoriaRam();
    }
    
}
