package uk.ac.rgu.topic7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        /* Three Person objects */
        Person person1 = new Person("Rogers", "Steve", 100);
        Person person2 = new Person("Parker", "Peter", 17);
        Person person3 = new Person("Danvers", "Carol", 25);

        /* Create a new ArrayList to hold them - we could also used LinkedList */
        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println(person); // printed in the order they were added
        }

        System.out.println("----");

        /* Create a new HashSet to hold the people */
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2);
        peopleSet.add(person3);

        /* If we try to add the same person twice...they're quietly ignored */
        peopleSet.add(person1);

        for (Person person : peopleSet) {
            System.out.println(person); // no guarantee of order...even if they might be
        }

        System.out.println("----");

        /* Use a Map to map people to their super hero name */
        Map<String, Person> avengers = new HashMap<>();
        avengers.put("Captain America", person1);
        avengers.put("Spider-Man", person2);
        avengers.put("Captain Marvel", person3);

        /* To access the values in a Map we need to loop over the keys */
        for (String key : avengers.keySet()) {
            System.out.println(key + ": " + avengers.get(key));
        }

        System.out.println("----");

        /* If we add a new value at the same key, it'll overwrite the previous one */
        Person person4 = new Person("Morales", "Miles", 17);
        avengers.put("Spider-Man", person4);

        for (String key : avengers.keySet()) {
            System.out.println(key + ": " + avengers.get(key));
        }

        System.out.println("----");

        /*
         * However...we can store multiple values at a single key by storing a
         * collection
         */
        List<Person> spideys = new ArrayList<>();
        spideys.add(person2);
        spideys.add(person4);

        Map<String, List<Person>> newAvengers = new HashMap<>();
        newAvengers.put("Spider-Man", spideys);

        /*
         * Looping through this time we can print the list
         * It's also possible to iterate the obtained list and print everything
         * individually
         */
        for (String key : newAvengers.keySet()) {
            System.out.println(key + ": " + newAvengers.get(key));
        }

        System.out.println("----");

        /*
         * To sort, we can use either the implementation of Comparable in Person objects
         * (surname)
         * or use the Comparator (age)
         * 
         * Note that all sorts are *in-place*. This means the original collection is
         * updated.
         */

        /* Sorting with Comparable is via the Collections.sort method */
        Collections.sort(people); // sorted by surname

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----");

        /* Sorting with a Comparator is by the sort method of the collection itself */
        people.sort(new Person.PersonComparator()); // sorted by age

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----");

        /*
         * Comparator is a *functional interface* so you can use a method reference or
         * lambda expression to implement a comparison that is used in .sort()
         */

        /* Sort people based on first name */
        people.sort((p1, p2) -> {
            return p1.getFirstname().compareTo(p2.getFirstname());
        });

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----");

        /* Streams allow you to process data without affecting the original collection
         */

         /* While technically not part of a stream, forEach is commonly considered one
          * It can be used in place of a for-loop to iterate over a collection, and do something with each data point.
          * It accepts a functional interface of type Consumer, so we can implement it with a lambda expression or method reference
          */

        people.forEach(System.out::println); // prints each element in turn

        System.out.println("----");

        /* The Stream interface itself provides many methods for working with data */

        /* The following takes each element in turn, filters based on age, then collects the result into a new List */
        List<Person> filteredPeople = people.stream().filter((p) -> p.getAge() > 17).collect(Collectors.toList());

        filteredPeople.forEach(System.out::println);

    }

}
