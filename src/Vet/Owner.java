// Pet's owner
package Vet;

import java.util.ArrayList;
import java.util.HashMap;

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

    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName(){
        return name;
    }

}
