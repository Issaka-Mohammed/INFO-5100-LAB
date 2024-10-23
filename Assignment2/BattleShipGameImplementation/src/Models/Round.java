/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ISHAQ
 */
public class Round {
    private int roundNumber;
    private int difficultyLevel;
    private Player playerTurn;

    public Round(int number, int difficultyLevel, Player playerTurn) {
        this.roundNumber = number;
        this.difficultyLevel = difficultyLevel;
        this.playerTurn = playerTurn;
    }

    public void startRound() {}
    public void endRound() {}
    public void increaseDifficultyLevel(){}
    
}
