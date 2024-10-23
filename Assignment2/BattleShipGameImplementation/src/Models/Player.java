/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ISHAQ
 */
public abstract class Player {
    String name;
    PlayerType type;
    int torpedoes;
    Ship[] ships;
    int score;

    public Player(String name) {
        this.name = name;
        //this.type = type;
        this.torpedoes = 45;
        this.ships = new Ship[6];
    }
    


    // Add ship to player (max 6 ships)
    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                System.out.println("Ship added successfully.");
                return;
            }
        }
        System.out.println("Error: Maximum number of ships reached.");
    }

    // Remove ship from player
    public void removeShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == ship) {
                ships[i] = null;
                System.out.println("Ship removed successfully.");
                return;
            }
        }
        System.out.println("Error: Ship not found.");
    }

    // List all ships of player
    public void listShips() {
        for (Ship ship : ships) {
            if (ship != null) {
                System.out.println(ship.toString());
            }
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public PlayerType getType() {
        return type;
    }

    public int getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(int torpedoes) {
        this.torpedoes = torpedoes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    
    
}
