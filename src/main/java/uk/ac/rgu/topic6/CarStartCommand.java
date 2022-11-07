package uk.ac.rgu.topic6;

/**
 * Class encapsulating a command for starting a car
 * Using this approach, you should have a class for every command (e.g., if there was a 
 * stopCar() method in the Car class, you would also need a CarStopCommand class etc.)
 * Normally this isn't needed and a method reference will suffice - but it serves as an
 * illustration of what's happening
 */
public class CarStartCommand implements Command{

    /* Field to store the target object */
    private Car car;

    public CarStartCommand(Car car){
        this.car = car;
    }

    /**
     * Implementation of the execute() method simply calls the required
     * method on the target object (in this case, the car field)
     */
    public void execute(){
        /* We delegate directly to the startCar() method */
        this.car.startCar();
    }
    
}
