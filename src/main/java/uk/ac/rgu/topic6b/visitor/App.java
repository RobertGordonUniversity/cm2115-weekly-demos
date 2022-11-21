package uk.ac.rgu.topic6b.visitor;

public class App {
    
    public static void main(String[] args){

        /* Create an array of cars
         * Remember - polymorphism allows them all to be stored
         * in the same array, but we normally lose context - i.e. 
         * they're all seen as Car objects
         */
        Car[] cars = {new Renault(), new Ford(), new Ferrari()};

        /* Create a CarVisitor, assigned to a BasicServiceVisitor */
        CarVisitor service = new BasicServiceVisitor();

        /* Iterate over all cars, passing them the visitor */
        for(Car car : cars){
            car.accept(service);
        }
    }

}
