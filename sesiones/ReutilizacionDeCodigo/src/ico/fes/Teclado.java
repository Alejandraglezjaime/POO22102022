/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author alejandraglezj
 */
public class Teclado {
    private String marca;
    private int numeroTeclas;
    private boolean multimedia; 

    public Teclado() {  //control+espacio+enter
    }

    public Teclado(String marca, int numeroTeclas, boolean multimedia) {  //control+espacio+enter
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
    }
    
    //ya lo demas es coon insertar code

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
    
}
