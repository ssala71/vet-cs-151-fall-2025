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
    // Testing
    public Owner(String name, String phoneNumber, String email, String address, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.age = age;
    }
    int x = 4;
}

