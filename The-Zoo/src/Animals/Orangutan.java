package Animals;


import AnimalTemplates.Primate;

/**
 * Write a description of class Animals.Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate {
    // instance variables - replace the example below with your own
    private int x;

    public Orangutan() {
        super("Orangutan", "orange and kinda friendly and intelligent");
    }
    public Orangutan(String name, String desc) {
        super(name, desc);
    }

    public String eat() {
        return "oranges and mangos";
    }
    public String makeNoise() {
        return "communicates with sign language";
    }
}
