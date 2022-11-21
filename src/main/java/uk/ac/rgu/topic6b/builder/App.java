package uk.ac.rgu.topic6b.builder;

public class App {
    public static void main(String[] args){

        /* Instead of creating a Pizza object directly, we create a PizzaBuilder
         * then call the relevant methods to customise it
         */
        PizzaBuilder builder = new PizzaBuilder();

        Pizza pepperoniPizza = builder.cheese()
                                      .tomatoSauce()
                                      .pepperoni()
                                      .getPizza();

        System.out.println(pepperoniPizza);

    }
}
