package uk.ac.rgu.topic6.furtherexamples;

/**
 * Similar Car class, different package - just to illustrate the return type
 * We want to encapsulate the getFuel() method as a command - which needs to return a Fuel enum
 */
public class Car{

    public Fuel fuel;

    public Car(Fuel fuel){
        this.fuel = fuel;
    }

    public Fuel getFuel(){
        return this.fuel;
    }
    



}
