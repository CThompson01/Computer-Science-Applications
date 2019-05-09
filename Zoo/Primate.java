public class Primate extends Animal implements Walking
    {
        public Primate()
        {
            super("primate", "a lot of monkey types");

        } 
        public Primate(String name, String desc)
        {
            super(name, desc);
        }
        public String makeNoise()
        {
            return "hoots";
        }
        public String eat()
        {
            return "bananas";
        }
        public String walk() {return "runs and walks";}

    
    }