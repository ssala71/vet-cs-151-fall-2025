package Clinic;
import java.util.ArrayList;
import java.util.Scanner;

public class VetMenu {
    
    ArrayList<Vet> vetList = new ArrayList<>();

    public VetMenu(){
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
}
