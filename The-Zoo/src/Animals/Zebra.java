package Animals;


import AnimalTemplates.Animal;

/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Animal {
    // instance variables - replace the example below with your own
    private int age;

    public Zebra() {
        super("Zebra", "black and white");
        age = 1;
    }

    public Zebra(String name, String desc) {
        super(name,desc);
        age = 1;
    }

    public String eat() {
        return "water and grass";
    }
    public String makeNoise() {
        return "horse noises";
    }
}
