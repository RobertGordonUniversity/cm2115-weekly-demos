package uk.ac.rgu.topic6;

/**
 * The Command functional interface represents an abstract command that can be
 * encapsulated and run. 
 * The aim of the Command pattern is to allow method calls to be stored for
 * later execution.
 */
public interface Command {
    /**
     * The execute() method, when implemented, calls the required method
     * on the relevant object.
     * Note that it doesn't return anything or accept any parameters. This means
     * the method it calls should be likewise. It is possible to create an updated
     * version that does return, with an example included in the "furtherexamples" package
     */
    public void execute();
}
