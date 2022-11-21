package uk.ac.rgu.topic6b.builder;

import java.lang.reflect.Field;

/**
 * Class encapsulating a Pizza - fairly standard
 */
public class Pizza {

    private int size = 12;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private boolean cheese = false;

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    private boolean tomatoSauce = false;

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    private boolean pepperoni = false;

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    private boolean pineapple = false;

    public boolean isPineapple() {
        return pineapple;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    private boolean ham = false;

    public boolean isHam() {
        return ham;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    /**
     * This implementation of toString() does something fancy to get the names
     * and values of the individual boolean fields in the class. If you want to
     * find out more, search for "java reflection"
     */
    public String toString() {
        String toReturn = "Pizza specification:\nSize: " + this.size + "\n";

        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.getType().isAssignableFrom(boolean.class)) {
                try {
                    if (f.getBoolean(this))
                        toReturn += f.getName() + "\n";
                } catch (IllegalAccessException e) {
                }
            }
        }

        return toReturn;

    }

}
