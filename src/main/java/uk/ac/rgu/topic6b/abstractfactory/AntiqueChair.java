package uk.ac.rgu.topic6b.abstractfactory;

/**
 * Provides an implementation of the Chair interface to represent an Antique Chair
 */
public class AntiqueChair implements Chair{

    @Override
    public String getDetails() {
        return "Antique chair";
    }
    
}
