package AnimalTemplates;

public class Bird extends Animal implements Flying {

    public Bird() {
        super("Bird", "an animal with wings that can fly");
    }
    public Bird(String name, String desc) {
        super(name, desc);
    }

    public String eat() {
        return "Seeds and Nuts";
    }
    public String makeNoise() {
        return "Caw";
    }
    public String fly() {
        return "flies around flapping its wings";
    }
}
