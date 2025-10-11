package Clinic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

class Appointment{
    private String[] week = {"Su","Mo","Tu","We", "Th", "Fr", "Sa"};
    private Integer[] DaysInWeek = {12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    HashMap<String[], Integer[]> weekMap = new HashMap<>();

    //Implementation: Figure out a way to register, what vetenarian they want and use that informaiton to set up a date according to this month
    public Appointment(){
        //Goes into the days where the vetenarian works based on pet
        
    }

    public void displayAppointmentTime(){
        //Appointment Scheduling Section
        System.out.println("Here are the availible appointment times for today:");
        LocalTime time1 = LocalTime.of(12, 0);
        LocalTime time2 = LocalTime.of(13, 0); //1pm
        LocalTime time3 = LocalTime.of(14, 0); //2pm
        LocalTime time4 = LocalTime.of(15, 0); //3pm
        LocalTime time5 = LocalTime.of(16, 0); //4pm

        System.out.println("1. " + time1);
        System.out.println("2. " + time2);
        System.out.println("3. " + time3);
        System.out.println("4. " + time4);
        System.out.println("5. " + time5);
        System.out.println("Please enter your choice (1-5)");
        int appointmentTime = scnr.nextInt();

        //converting (int) appointmentTime into LocalTime reference 
        LocalTime timeChoice;
        if (appointmentTime == 1) {
            timeChoice = time1;
        } else if (appointmentTime == 2) {
            timeChoice = time2;
        }
        else if (appointmentTime == 3) {
            timeChoice = time2;
        } 
        else if (appointmentTime == 4) {
            timeChoice = time2;
        }
        else {
            timeChoice = time5;
        }

        LocalDateTime appointmentDateTime = LocalDateTime.of(LocalDate.now(), timeChoice);
        System.out.println(appointmentDateTime);
    }

    public void figureAppointmentDate(){

    }
    public void calendar(){
        for (int i = 0; i < week.length; i++){
            System.out.print(week[i] + "  ");
            for (int j = 12; j < 12 + week.length; i++){
                System.out.print(i + "  ");
        }
        }
        System.out.println();
        
    }
}