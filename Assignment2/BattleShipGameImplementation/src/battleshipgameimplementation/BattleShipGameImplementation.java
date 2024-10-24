/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleshipgameimplementation;

import Models.Coordinate;
import Models.Game;
import Models.GameType;
import Models.Human_Player;
import Models.Computer_Player;
import Models.Player;
import Models.PlayerType;
import Models.Ship;

/**
 *
 * @author ISHAQ
 */
public class BattleShipGameImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coordinate ship1_Coordinate = new Coordinate (1, 1);
        Coordinate ship2_Coordinate = new Coordinate (2, 2);
        
        // Create game
    Game game = new Game(GameType.HUMAN_VS_HUMAN);
    
    // Create players
    Human_Player player1 = new Human_Player("Isska");
    Human_Player player2 = new Human_Player("Mohammed");
    Human_Player player3 = new Human_Player("Baba");
    
    // Add players to game
    System.out.println("Adding players to the game:");
    game.addPlayer(player1);
    game.addPlayer(player2);
    System.out.println();
    
    //Attempting to add a third player gives an error
    System.out.println("Attempting to add a 3rd player to the gives an error message:");
    game.addPlayer(player3);
    System.out.println();
    
    // Create ships
    Ship ship1 = new Ship(5, 10, ship1_Coordinate);
    Ship ship2 = new Ship(3, 5, ship2_Coordinate);
    
    // Add ships to players
    player1.addShip(ship1);
    player2.addShip(ship2);
    System.out.println();
    
    // List players and ships
    System.out.println("Listing the ships and players in the game:");
    game.listPlayers();
    player1.listShips();
    player2.listShips();
    System.out.println();
    
    // Remove player from game
    System.out.println("Removing a player from the game:");
    game.removePlayer(player2);
    
    // List players after removal
    System.out.println("Listing the players after romoving one:");
    game.listPlayers();
    System.out.println();
    
    
    }   
}
