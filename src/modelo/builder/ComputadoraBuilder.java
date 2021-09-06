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
public abstract class ComputadoraBuilder {
    
    protected Computadora Compu ;
;    
    public Computadora getCompu(){
        
        return Compu;
        
    }
    public Computadora crearCompu(){
        
        Compu=new Computadora();
        return null;
    }
    
    public abstract void builMarca();
    public abstract void buildProcesador();
    public abstract void buildmemoriaRam();
    
    
}
