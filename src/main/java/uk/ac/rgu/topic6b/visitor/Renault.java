package uk.ac.rgu.topic6b.visitor;

public class Renault implements Car {

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }

    public void someRenaultMethod(){
        System.out.println("This is a Renault");
    }
    
}
