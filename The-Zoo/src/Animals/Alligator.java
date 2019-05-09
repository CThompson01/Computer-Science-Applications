package Animals;


import AnimalTemplates.Reptile;
import AnimalTemplates.Swimming;

/**
 * Write a description of class Animals.Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Reptile implements Swimming {
    // instance variables - replace the example below with your own
    private int x;

    public Alligator() {
        super("Alligator", "visciously roars and is dangerous");
    }


    @Override
    public String swim() {
        return "swims in circle looking for food";
    }
}
