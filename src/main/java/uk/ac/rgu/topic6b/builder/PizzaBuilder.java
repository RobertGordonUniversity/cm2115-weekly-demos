package uk.ac.rgu.topic6b.builder;

/**
 * A PizzaBuilder allows many different combinations of pizza toppings to be created
 * without needing multiple constructors (or a large constructor) in the Pizza class itself
 */
public class PizzaBuilder {
 
    private Pizza pizza;

    public PizzaBuilder(){
        this.pizza = new Pizza();
    }

    /**
     * Individual methods set the fields of the Pizza. Where a field accepts a value (such as an int)
     * we accept it as a parameter here, then pass it in.
     * 
     * All methods return this PizzaBuilder object, which allows us to chain calls
     * @param size
     * @return
     */
    public PizzaBuilder size(int size){
        this.pizza.setSize(size);
        return this;
    }

    /**
     * Methods setting a boolean property don't take a parameter, and instead calling them is 
     * interpreted as "add <the thing>" (e.g. "add cheese")
     * @return
     */
    public PizzaBuilder cheese(){
        this.pizza.setCheese(true);
        return this;
    }

    public PizzaBuilder tomatoSauce(){
        this.pizza.setTomatoSauce(true);
        return this;
    }

    public PizzaBuilder pepperoni(){
        this.pizza.setPepperoni(true);
        return this;
    }

    public PizzaBuilder pineapple(){
        this.pizza.setPineapple(true);
        return this;
    }

    public PizzaBuilder ham(){
        this.pizza.setHam(true);
        return this;
    }

    /**
     * Finally, we have a method to return the built Pizza object
     * @return
     */
    public Pizza getPizza(){
        return this.pizza;
    }

}
