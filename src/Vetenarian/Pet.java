package Vetenarian;
public abstract class Pet{
    // Attributes
    private String name;
    private String bloodType;
    private int age;
    private String speciesColor;
    private String gender;
    private int id;

    // Constructor
    public Pet(String name, String bloodType, int age, String speciesColor, String gender, int id){
        this.name = name;
        this.bloodType = bloodType;
        this.age = age;
        this.speciesColor = speciesColor;
        this.gender = gender;
        this.id = id;
    }
}
