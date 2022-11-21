package uk.ac.rgu.topic6b.visitor;

public class Ford implements Car{

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this); 
    } 

    public void someFordMethod(){
        System.out.println("This is a Ford");
    }
}
