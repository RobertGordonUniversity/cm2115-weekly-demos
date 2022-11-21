package uk.ac.rgu.topic6b.abstractfactory;

/**
 * Provides an implementation of the Lamp interface to represent an Antique Lamp
 */
public class AntiqueLamp implements Lamp{

    @Override
    public String getDetails() {
        return "Antique chair";
    }
    
}
