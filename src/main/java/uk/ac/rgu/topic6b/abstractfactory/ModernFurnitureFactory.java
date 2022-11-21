package uk.ac.rgu.topic6b.abstractfactory;

/**
 * A concrete implementation of a furniture factory 
 * This implements the required methods by returning the "Modern" implementations 
 * of Chair, Table and Lamp
 */
public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }

    @Override
    public Lamp getLamp() {
        return new ModernLamp();
    }   
}
