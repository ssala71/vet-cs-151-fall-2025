public class BaseMenu implements Menu{
    void display(){
        System.out.println("What would you like to do today?");
        System.out.println("1. Register a pet");
        System.out.println("2. Check Medical Records");
        System.out.println("3. Check Pet Status");
        System.out.println("4. Register an appointment");
        System.out.println("5. Display all Vetenarians");

        int option = scnr.nextInt();

        if (option == 1){
            System.out.println("W");
        }
        if (option == 2){

        }
        if (option == 3){

        }
        if (option == 4){

        }
        if (option == 5){
            VetMenu menu = new VetMenu();
            menu.displayVetenarians();
        }

    }
}
