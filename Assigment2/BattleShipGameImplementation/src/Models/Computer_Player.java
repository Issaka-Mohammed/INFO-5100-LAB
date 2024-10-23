/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Models.Player;

/**
 *
 * @author ISHAQ
 */
public class Computer_Player extends Player {

    public Computer_Player(String name) {
        super(name);
        super.type = PlayerType.COMPUTER;
    }
  
    
}
