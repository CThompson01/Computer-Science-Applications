package AnimalTemplates;

public class Flying extends Animal {
    public Flying(String name, String desc) {
        super(name, desc);
    }

    public String fly() {
        return "Fly";
    }

    @Override
    public String eat() {
        return "Seeds and Nuts";
    }

    @Override
    public String makeNoise() {
        return "Caw";
    }
}
