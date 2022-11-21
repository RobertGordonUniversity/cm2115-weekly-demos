package uk.ac.rgu.topic6b.visitor;

public class BasicServiceVisitor implements CarVisitor{

    @Override
    public void visit(Renault car) {
        /* We can now call Renault-specific methods that were previously hidden
         * by it being treated as a Car type
         */
        car.someRenaultMethod();
        System.out.println("Performing a basic Renault service");        
    }

    @Override
    public void visit(Ford car) {
        /* We can now call Ford-specific methods that were previously hidden
         * by it being treated as a Car type
         */
        car.someFordMethod();
        System.out.println("Performing a basic Ford service");
        
    }

    @Override
    public void visit(Ferrari car) {
        /* We can now call Ferarri-specific methods that were previously hidden
         * by it being treated as a Car type
         */
        car.someFerrariMethod();
        System.out.println("Performing a basic Ferrari service"); 
    }
    
}
