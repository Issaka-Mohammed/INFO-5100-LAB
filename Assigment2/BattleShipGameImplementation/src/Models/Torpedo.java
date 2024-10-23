/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ISHAQ
 */
public class Torpedo {
    private Coordinate coordinate = null;
    public Torpedo() {}
    
    public void launch(Coordinate coordinate){
        this.coordinate = coordinate;
        // Logic to launch torpedo
    }
    
    public Coordinate getCoordinate() {
        return coordinate;
    }
    
}
