package uk.ac.rgu.topic6;

/**
 * An example of another Logger implemented using the Singleton pattern
 * This is designed to demonstrate that Singleton allows for interface
 * implementations, and as such is more flexible than using classes
 * with static fields and methods for storing and updating state
 */
public class ErrorLogger implements Logger{

    private static ErrorLogger instance = null;

    public static ErrorLogger getInstance(){
        if(instance == null){
            instance = new ErrorLogger();
        }
        return instance;
    }

    private ErrorLogger(){

    }

    @Override
    public void log(String msg) {
        System.out.println("Error logger: " + msg);
    }
    
}
