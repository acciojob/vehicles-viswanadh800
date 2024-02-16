package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String name) {
        this.name=name;
        currentDirection=0;
        currentSpeed=0;
    }

    public int getCurrentDirection(){
        return currentDirection;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection+=direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        currentSpeed=speed;
        currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
