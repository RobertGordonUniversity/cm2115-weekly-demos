package uk.ac.rgu.topic6b.abstractfactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    
    public static void main(String[] args){


        Map<String, String> m = new HashMap<>();

        Collection<String> v = m.values();


        /* We'll create a FurnitureFactory object, and assign it to an
         * AntiqueFurnitureFactory
         */
        FurnitureFactory factory = new AntiqueFurnitureFactory();

        System.out.println("==Using an AntiqueFurnitureFactory==");
        /* Call the furnishRoom method with this factory */
        furnishRoom(factory);

        System.out.println(); //empty line break

        /* We can also use a ModernFurnitureFactory */
        factory = new ModernFurnitureFactory();

        System.out.println("==Using a ModernFurnitureFactory==");
        furnishRoom(factory);
    }

    /**
     * Method to furnish a room, that accepts an AbstractFactory
     * This method has no idea about *specific* factories - but we can give it
     * one using Polymorphism, which will allow the method to use 
     * the different types of furniture
     * @param factory
     */
    public static void furnishRoom(FurnitureFactory factory){

        /* Use the factory to get the items of furniture */
        Chair theChair = factory.getChair();
        Table theTable = factory.getTable();
        Lamp theLamp = factory.getLamp();

        System.out.println("Furnishing a room with: ");
        
        System.out.println(theChair.getDetails());
        System.out.println(theTable.getDetails());
        System.out.println(theLamp.getDetails());
    }

}
