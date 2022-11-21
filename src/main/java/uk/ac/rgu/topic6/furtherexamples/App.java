package uk.ac.rgu.topic6.furtherexamples;

public class App {
    
    public static void main(String[] args){

        /* We still want to store multiple unrelated commands, but now we have a generic type
         * The type can be ignored...but we do get a warning
         */
        CommandWithReturn<?>[] commands = new CommandWithReturn[10];

        /* Create a car and encapsulate its getFuel() method as a CarFuelCommand */
        Car car1 = new Car(Fuel.PETROL);
        CarFuelCommand command = new CarFuelCommand(car1);

        commands[0] = command;

        /* Alternatively, we can do it as a method reference - this still works, but we need
         * to specify the generic parameter in the CommandWithReturn object
         */
        Car car2 = new Car(Fuel.ELECTRIC);
        CommandWithReturn<Fuel> fuelCommand = car2::getFuel;
        commands[1] = fuelCommand;

        System.out.println(commands[0].execute());
        System.out.println(commands[1].execute());
    }

}
