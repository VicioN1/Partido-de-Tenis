/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Player.players;

/**
 *
 * @author VicioN1
 */
public class Juego {
    public players Partido(players player1, players player2){
        players ganador=new players();
        player1.setRacha(Math.floor(Math.random()*10+1));
        player2.setRacha(Math.floor(Math.random()*10+1));
        
        if(player1.getRacha()>player2.getRacha()){
            ganador=player1;
        }else{
            ganador=player2;
        }
        return ganador;
    }
    
    public players reinicio(players player1, players player2){
         player1.setRacha(0);
        player2.setRacha(0);
        return null;
    }
}
