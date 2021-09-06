/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobuilder;

import javax.swing.JOptionPane;
import modelo.Computadora;
import modelo.builder.CompuDeApple;
import modelo.builder.CompuDelGobierno;
import modelo.builder.Computadoria;

/**
 *
 * @author Fernandito
 */
public class EjercicioBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadoria local = new Computadoria();
        local.setBuilder(new CompuDelGobierno());
        local.darCompuComputadora();
        Computadora Compu= local.getCompucomputadora();
        JOptionPane.showMessageDialog(null, Compu);
        
        local.setBuilder(new CompuDeApple());
        local.darCompuComputadora();
        Compu= local.getCompucomputadora();
        JOptionPane.showMessageDialog(null, Compu);
        
    }
    
}
