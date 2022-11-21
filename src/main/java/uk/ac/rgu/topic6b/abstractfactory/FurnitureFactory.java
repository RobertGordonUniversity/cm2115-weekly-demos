package uk.ac.rgu.topic6b.abstractfactory;

/**
 * An interface to describe any kind of furniture factory
 * Any such factory can give us Chair, Table and Lamp objects
 * but we don't care what their specific type is
 */
public interface FurnitureFactory {
    public Chair getChair();
    public Table getTable();
    public Lamp getLamp();
}
