package uk.ac.rgu.topic6;

/**
 * An example of a class implemented using the Singleton pattern
 * It implements an interface to illustrate the flexibility that Singleton
 * affords over the use of static fields and methods to store shared state
 */
public class VerboseLogger implements Logger {
    
    /* The static instance of VerboseLogger is what we will use throughout our
     * system. It's initially assigned to null to ensure only one is created
     */
    private static VerboseLogger instance = null;


    /* The numTimesCalled field is to show that we have the same object
     * wherever it is used - it's not an essential part of the implementation
     */
    private int numTimesCalled = 0;

    /**
     * The getInstance method returns the single VerboseLogger instance
     * If necessary, it also creates it - but then can't create it again
     * @return
     */
    public static VerboseLogger getInstance(){
        if(instance == null){
            instance = new VerboseLogger();
        }
        return instance;
    }

    /**
     * The private constructor prevents classes outside this class from creating instances of it
     * and underpins the main principle of Singleton
     */
    private VerboseLogger(){

    }

    @Override
    public void log(String msg) {
        System.out.println("Verbose logger: " + msg);

        /* We increment this field to demonstrate that it's the same object used everywhere */
        this.numTimesCalled++;
        System.out.println(this.numTimesCalled);
    }

}
