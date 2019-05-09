package Animals;


import AnimalTemplates.Bird;

/**
 * Write a description of class Animals.Parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Bird {
    // instance variables - replace the example below with your own
    private int age;

    public Parrot() {
        super("Parrot", "green and fleeting");
        age = 2;
    }
    public Parrot(String name, String desc) {
        super(name, desc);
        age = 2;
    }

    public String eat() {
        return "special low-fat bird seed";
    }

    public String makeNoise() {
        return "repeats random phrases";
    }
}
