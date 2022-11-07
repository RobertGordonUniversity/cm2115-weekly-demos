package uk.ac.rgu.topic6.furtherexamples;

/**
 * Example of a Command interface that allows a return type
 * You specify the return type via the generic parameter
 */
public interface CommandWithReturn<T> {

    public T execute();
    
}
