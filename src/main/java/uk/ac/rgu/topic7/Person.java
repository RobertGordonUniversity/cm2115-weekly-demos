package uk.ac.rgu.topic7;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    
    private String surname, firstname;
    private int age;

    public Person(String surname, String firstname, int age){
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.firstname + " " + this.surname + " " + this.age;
    }


    @Override
    /**
     * Method that allows this person object to be compared to another
     * If this person should go before the other, return -1 (or any negative int)
     * If this person and the other are equal, return 0
     * If this person should go after the other, return 1 (or any positive int)
     * 
     * This method creates the *natural ordering* of Person objects - how they
     * should be sorted by default
     * 
     * Normally, we could just return the result of comparing the surnames...but the
     * method is implemented more fully here to illustrate
     * @param o
     * @return
     */
    public int compareTo(Person o) {
        int compare = this.surname.compareTo(o.surname);

        if(compare < 0){
            return -1;
        }else if(compare == 0){
            return 0;
        }else{
            return 1;
        }
    }

    /**
     * Inner class to provide a Comparator that compares Person objects based on their age
     * Same principles apply - if o1 goes before o2, return -1; if they're the same, return 0;
     * if o1 goes after o2, return 1
     * 
     * This comparator provides an alternative ordering of Person objects - how they might be sorted
     * in a specific application
     */
    public static class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            if(o1.age < o2.age){
                return -1;
            }else if(o1.age == o2.age){
                return 0;
            }else{
                return 1;
            }
        }
    }


}
