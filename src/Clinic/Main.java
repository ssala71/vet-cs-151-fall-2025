package Clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to ____ Vetenarian. We welcome you with open arms!");
        System.out.println("Now we would like to ask for your name.");
        String name = scnr.nextLine();

        System.out.println("Great, lovely to meet you " + name + "! We would like a little bit more info before we proceed.");

        System.out.println("What number would we be able to contact you?");
        String number = scnr.nextLine();

        System.out.println("Perfect. Whats your email address to send you updates via email?");
        String email = scnr.nextLine();

        System.out.println("What address could we send mail to?");
        String address = scnr.nextLine();

        System.out.println("Final question. How old are you?");
        int age = scnr.nextInt();


        Owner user = new Owner(name,number,address,email,age);

        System.out.println("Thank you!");
        
        //Maybe make an interface, first one would be in owner since it registers owner info
        //This would be in pet and would
        System.out.println("Now we would like to ask, register your pet.");
        System.out.println("Now tell us what type of pet are you choosing");
        System.out.println("Dog, Cat, Reptile, fish,Birds, Other");
        String petType = scnr.nextLine();

        System.out.println("What's your pet's name?");
        String petName = scnr.nextLine();

        System.out.println("What's your pet's bloodType?");
        String bloodType = scnr.nextLine();

        System.out.println("What's your pet's age?");
        int petAge = scnr.nextInt();

        System.out.println("What color is your pet?");
        String speciesColor = scnr.nextLine();

        System.out.println("What's your pet's gender?");
        String petGender = scnr.nextLine();
        
        //Pet newPet = new Pet(petName, bloodType, petAge, speciesColor, petGender, petAge);
        
        
        Vet generalVet = new Vet("Dr.", "male", 65, "General Expert", "Monday, Tuesday, Wednesday, Thursday");
        Vet catVet = new Vet("Dr.", "female", 32, "Cat Expert", "Monday, Thursday, Saturday");
        Vet dogVet = new Vet("Dr.", "male", 35, "Dog Expert", "Sunday, Tuesday, Thuesday, Saturday");
        Vet birdVet = new Vet("Dr.", "female", 28, "Bird Expert","Monday, Tuesday, Friday");
        Vet reptileVet = new Vet("Dr.", "female", 25,"Reptile Expert","Friday, Tuesday");

        ArrayList<Vet> vetList = new ArrayList<>();        //Testing
        VetMenu menu = new VetMenu();
        menu.displayVetenarians();

    }

    

    
}
