 

public abstract class Animal
{
    private String name;  //use "this" to refer to instance fields
    private String desc;
    
    public Animal(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    //abstract methods are declared with the signature only
    public abstract String eat();
    public abstract String makeNoise();

}




