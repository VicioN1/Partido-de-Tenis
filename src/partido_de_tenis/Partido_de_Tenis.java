/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partido_de_tenis;

import Game.Juego;
import Player.players;
import java.util.Scanner;

/**
 *
 * @author VicioN1
 */
public class Partido_de_Tenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        players a = new players();
        players b = new players();
        Juego j = new Juego();
        int Eleccion = 0;
        boolean condicion = true;
        do {
            System.out.println("Elegir Opcion");
            System.out.println("1-- Configurar Jugadores");
            System.out.println("2-- Jugar");
            Eleccion = leer.nextInt();
            switch (Eleccion) {
                case 1:
                    System.out.println("Jugador 1 Datos");
                    System.out.println("");

                    System.out.println("Nombre jugador");
                    a.setNombre(leer.next());
                    System.out.println("Pais del jugador");
                    a.setPais(leer.next());
                    a.setRacha(0);
                    System.out.println("");
                    System.out.println("Jugador 2 Datos");
                    System.out.println("");

                    System.out.println("Nombre jugador");
                    b.setNombre(leer.next());
                    System.out.println("Pais del jugador");
                    b.setPais(leer.next());
                    b.setRacha(0);
                    break;
                case 2:
                    if (a.getNombre() == null || b.getNombre() == null ) {
                        System.out.println("jugadores invalidos vuelva a llenar datos");
                    } else {
                        System.out.println(j.Partido(a, b));
                        condicion = false;
                        j.reinicio(a, b);
                    }
                default:
                    if (Eleccion < 1 || Eleccion > 2) {
                        System.out.println("Opcion Incorrecta");
                    } 
            }
        } while (condicion);
        // TODO code application logic here
    }
}
