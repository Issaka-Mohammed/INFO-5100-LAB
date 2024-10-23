/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ISHAQ
 */
public class Game {
    private Date startTime;
    private Date endTime;
    private GameType type;
    private Player winner;
    private int points;
    private ArrayList<Player> players;

    public Game(GameType type) {
        this.type = type;
        this.players = new ArrayList<>();
    }

    // Add player to game (max 2 players)
    public void addPlayer(Player player) {
        if (players.size() < 2) {
            players.add(player);
            System.out.println("Player added successfully.");
        } else {
            System.out.println("Error: Maximum number of players reached.");
        }
    }

    // Remove player from game
    public void removePlayer(Player player) {
        if (players.remove(player)) {
            System.out.println("Player removed successfully.");
        } else {
            System.out.println("Error: Player not found.");
        }
    }

    // List all players in game
    public void listPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    // Getters and setters
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public GameType getType() {
        return type;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
