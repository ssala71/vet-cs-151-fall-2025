package Vetenarian;

import java.util.ArrayList;
import java.util.HashMap;

// Pet's owner
public class Owner {
    // Attributes 
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private int age;

    protected ArrayList<String> pet = new ArrayList<>();

    HashMap<String, ArrayList<String> > list = new HashMap<>();

    // Constructor 
    
    public Owner(String name, String phoneNumber, String email, String address, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    // Getter
    public String getName() {
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String email(){
        return this.email;
    }
    public String address(){
        return this.address;
    }
    public int age(){
        return this.age;
    }

    // Setter
    public void setName(String ownerName){
        this.name = ownerName;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
}

