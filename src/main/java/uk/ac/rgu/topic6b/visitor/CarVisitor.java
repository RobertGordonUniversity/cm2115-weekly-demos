package uk.ac.rgu.topic6b.visitor;

public interface CarVisitor {
    public void visit(Renault car);
    public void visit(Ford car);
    public void visit(Ferrari car);
}
