package uk.ac.rgu.topic6.furtherexamples;

public class CarFuelCommand implements CommandWithReturn<Fuel>{

    private Car car;

    public CarFuelCommand(Car car){
        this.car = car;
    }


    @Override
    public Fuel execute() {
        return this.car.getFuel();
    }
    
}
