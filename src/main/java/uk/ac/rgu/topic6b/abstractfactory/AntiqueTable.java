package uk.ac.rgu.topic6b.abstractfactory;

/**
 * Provides an implementation of the Table interface to represent an Antique Table
 */
public class AntiqueTable implements Table{

    @Override
    public String getDetails() {
        return "Antique table";
    }
    
}
