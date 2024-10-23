/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ISHAQ
 */
public class Ship {
    private int size;
    private int value;
    private Coordinate coordinate;
    private int x;
    private int y;
    
    
    public Ship(int size, int value, Coordinate coordinate) {
        this.size = size;
        this.value = value;
        this.x = coordinate.getxCoordinate();
        this.y = coordinate.getyCoordinate();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    

    // Getters and setters
    public int getSize() {
        return size;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Ship [size=" + size + ", value=" + value + ", x=" + x + ", y=" + y + "]";
    }
    
    
    public void setPosition(){}
    public void getShipStatus(){}
    
    
}
