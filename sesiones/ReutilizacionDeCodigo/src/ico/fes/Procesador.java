/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author alejandraglezj
 */
public class Procesador {
    private String marca;
    private String modelo;
    private float velocidad;
    
    public Procesador(){}

    public Procesador(String marca, String modelo, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    
    // GETS AND SETTERS
    
    // toString

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
    
    
}
