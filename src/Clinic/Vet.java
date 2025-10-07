package Clinic;

import java.util.ArrayList;
import java.util.Scanner;
public class Vet {
    public String name;
    public String gender;
    public int age;
    public String title;
    public String availableDays;
    
    public Vet(String name, String gender, int age, String title, String availableDays){
        this.name = name;
        this.gender = gender;
        this.title = title;
        this.age = age;
        this.availableDays = availableDays;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge() {
        return age;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public String getGender() {
        return gender;
    }

}
