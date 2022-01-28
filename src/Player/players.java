/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author VicioN1
 */
public class players {
    public String Nombre;
    public String Pais;
    public double Racha;

    public players(String Nombre, String Pais, int Racha) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Racha = Racha;
    }

    public players() {
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public double getRacha() {
        return Racha;
    }

    public void setRacha(double Racha) {
        this.Racha = Racha;
    }

    @Override
    public String toString() {
        return "players{" + "Nombre=" + Nombre + ", Pais=" + Pais + ", Racha=" + Racha + '}';
    }
    
    
}
