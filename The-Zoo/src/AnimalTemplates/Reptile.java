package AnimalTemplates;

public class Reptile extends Animal implements Carnivore {

    public Reptile() {
        super("Reptile", "Scaly and potentially dangerous");
    }

    public Reptile(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String eat() {
        return eats;
    }

    @Override
    public String makeNoise() {
        return intimidate;
    }
}
