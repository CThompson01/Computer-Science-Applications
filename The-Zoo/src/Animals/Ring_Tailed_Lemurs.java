package Animals;

import AnimalTemplates.Primate;

public class Ring_Tailed_Lemurs extends Primate {

    public Ring_Tailed_Lemurs() {
        super("Ring Tailed Lemur", "black and white and dumb");
    }
    public Ring_Tailed_Lemurs(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String makeNoise() {
        return "Scream and Sing \"I like to move it\"";
    }
}
