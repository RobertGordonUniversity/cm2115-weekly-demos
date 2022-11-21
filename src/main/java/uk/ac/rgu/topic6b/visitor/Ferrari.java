package uk.ac.rgu.topic6b.visitor;

public class Ferrari implements Car{

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }

    public void someFerrariMethod(){
        System.out.println("This is a Ferrari");
    }
    
}
