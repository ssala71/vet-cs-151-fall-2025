package Vetenarian;

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

    }
}
