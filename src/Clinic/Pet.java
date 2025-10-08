package Clinic;

public abstract class Pet{
    // Attributes
    private String name;
    private String bloodType;
    private int age;
    private String speciesColor;
    private String gender;
    private int id;
    private int ownerId;

    // Constructor
    public Pet(String name, String bloodType, int age, String speciesColor, String gender, int ownerId){ 
        this.name = name;
        this.bloodType = bloodType;
        this.age = age;
        this.speciesColor = speciesColor;
        this.gender = gender;
        this.id = UUID.randomUUID().toString();
        this.ownerId = ownerId;
    }
}
