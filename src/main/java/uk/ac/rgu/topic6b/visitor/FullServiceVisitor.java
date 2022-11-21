package uk.ac.rgu.topic6b.visitor;

/**
 * Another implementation of CarVisitor - see BasicServiceVisitor for more details
*/
public class FullServiceVisitor implements CarVisitor{

    @Override
    public void visit(Renault car) {
        car.someRenaultMethod();
        System.out.println("Performing a full Renault service");       
    }

    @Override
    public void visit(Ford car) {
        car.someFordMethod();
        System.out.println("Performing a full Ford service");       
    }

    @Override
    public void visit(Ferrari car) {
        car.someFerrariMethod();
        System.out.println("Performing a full Ferrari service");
    }
    
}
