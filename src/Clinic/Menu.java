package Clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
   ArrayList<Vet> vetList = new ArrayList<>();
   Scanner scnr = new Scanner(System.in);
   
   public Menu(){
      Vet generalVet = new Vet("Dr.", "male", 65, "General Expert", "Monday, Tuesday, Wednesday, Thursday");
      Vet catVet = new Vet("Dr.", "female", 32, "Cat Expert", "Monday, Thursday, Saturday");
      Vet dogVet = new Vet("Dr.", "male", 35, "Dog Expert", "Sunday, Tuesday, Thuesday, Saturday");
      Vet birdVet = new Vet("Dr.", "female", 28, "Bird Expert","Monday, Tuesday, Friday");
      Vet reptileVet = new Vet("Dr.", "female", 25,"Reptile Expert","Friday, Tuesday");

      vetList.add(generalVet);
      vetList.add(dogVet);
      vetList.add(catVet);
      vetList.add(birdVet);
      vetList.add(reptileVet);

      introMenu();
   }

   public void introMenu(){
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

        displayPetMenu();
   }
   
   public void displayMenu(){
      System.out.println("What would you like to do today?");
        System.out.println("1. Register a pet");
        System.out.println("2. Check Medical Records");
        System.out.println("3. Check Pet Status");
        System.out.println("4. Register an appointment");
        System.out.println("5. Display all Vetenarians");

        Scanner scnr = new Scanner(System.in);
        int option = scnr.nextInt();

        if (option == 1){
            //Call Pet menu instead of huge chunk of code
        }
        if (option == 2){
            //medical records display
        }
        if (option == 3){
            //checks if pet is healthy
        }
        if (option == 4){
            //calls appointment class
        }
        if (option == 5){
            displayVetenarians();
        }
   }

   public void displayVetenarians(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("===All Vetenarians===");
        int page = 1;
        int index = 0;
        while (true){
            
            Vet v = vetList.get(index);

            System.out.println("Vetenarian " + page);
            System.out.println("Name: " + v.getName());
            System.out.println("Age: " + v.getAge());
            System.out.println("Gender: "+ v.getGender());
            System.out.println("Availability: " + v.getAvailableDays());
            System.out.println("1. Exit out");
            System.out.println("2. Next Page (" + page + "/5)");

            if (page >= 2){
                System.out.println("3. Previous page (" + page + "/5)");
            }

            int result = scnr.nextInt();

            if (result == 1){
                //Go back to the main menu
            }
            if (result == 2){
                index++;
                page++;
            }
            if (result == 3){
                index--;
                page--;
                
            }
        }
        
    }

    public void displayPetMenu(){
        System.out.println("Now we would like to ask, register your pet.");
        System.out.println("Now tell us what type of pet are you choosing");
        System.out.println("1. Dog \n2. Cat\n3. Reptile\n4. Fish\n5. Birds\n6. Other");
        int petType = scnr.nextInt();

        System.out.println("What's your pet's name?");
        String petName = scnr.nextLine();

        System.out.println("What's " + petName + "'s bloodType?");
        String bloodType = scnr.nextLine();

        System.out.println("What's " + petName +"'s age?");
        int petAge = scnr.nextInt();

        System.out.println("What color is "+ petName+ "?");
        String speciesColor = scnr.nextLine();

        System.out.println("What's "+petName+"'s gender?");
        String petGender = scnr.nextLine();


        if (petType == 1){
            //Dog pet = new Dog(petName, bloodType, petAge, speciesColor, petGender);
        }
        if (petType == 2){}
        if(petType == 3){}
        if(petType == 4){}
        if(petType == 5){}
        else{
        }
    }
}
