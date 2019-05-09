public interface Walking
{
    //ALL VARIABLES ARE AUTOMATICALLY PUBLIC STATIC FINAL
    //WHETHER YOU WRITE THE MODIFIERS OR NOT
    public static final int MAX_WALK_DISTANCE = 500;
    int MIN_WALK_DISTANCE = 0;
    
    //all* methods are PUBLIC and ABSTRACT by default whether or not
    //you write it.
    //*things changed slightly in java 8, don't worry about.
    String walk();
}
