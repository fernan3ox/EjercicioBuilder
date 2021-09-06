/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fernandito
 */
public class Computadora {
    
    private String Marca;
    private String Procesador;
    private int memoriaRam;
    
    public Computadora(String Marca, String Procesador, int memoriaRam){
        
        this.Marca=Marca;
        this.Procesador=Procesador;
        this.memoriaRam=memoriaRam;
        
    }
    public Computadora(){
        
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Procesador=" + Procesador + ", memoriaRam=" + memoriaRam + '}';
    }
    
    
}
