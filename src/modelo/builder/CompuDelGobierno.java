/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.builder;

/**
 *
 * @author Fernandito
 */
public class CompuDelGobierno extends ComputadoraBuilder {

    @Override
    public void builMarca() {
        Compu.setMarca("Exo");
    }

    @Override
    public void buildProcesador() {
        Compu.setProcesador("Atom");
    }

    @Override
    public void buildmemoriaRam() {
        Compu.setMemoriaRam(4);
    }
    
    
}
