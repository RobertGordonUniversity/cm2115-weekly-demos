package uk.ac.rgu.topic6b.abstractfactory;

/**
 * A concrete implementation of a furniture factory
 * This implements the required methods by returning the "Antique" implementations 
 * of Chair, Table and Lamp
 */
public class AntiqueFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new AntiqueChair();
    }

    @Override
    public Table getTable() {
        return new AntiqueTable();
    }

    @Override
    public Lamp getLamp() {
        return new AntiqueLamp();
    }
    
}
