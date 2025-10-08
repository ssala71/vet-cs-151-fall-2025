package Clinic;

import java.util.HashMap;

class Appointment{
    private String[] week = {"Su","Mo","Tu","We", "Th", "Fr", "Sa"};
    private Integer[] DaysInWeek = {12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    HashMap<String[], Integer[]> weekMap = new HashMap<>();

    //Implementation: Figure out a way to register, what vetenarian they want and use that informaiton to set up a date according to this month
    public Appointment(){
        //Goes into the days where the vetenarian works based on pet
        
    }

    public void displayAppointment(){
        System.out.println("Based on your preferred Vetenarian");
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