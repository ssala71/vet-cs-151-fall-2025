package Vet;

public class Vet {
    public String name;
    public String gender;
    public int age;
    public String title;
    public boolean isAvailible;

    public Vet(String name, String gender, int age, String title, boolean isAvailible){
        this.name = name;
        this.gender = gender;
        this.title = title;
        this.isAvailible = isAvailible;
    }

    public String getName(){
        return name;
    }

}
