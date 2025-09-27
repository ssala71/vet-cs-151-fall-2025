package Vet;

public class inflammationMedicine extends Medication implements Service{
    /** There's no reason to re-modify the medication names and price */
    private final String medicationName = "Inflammmation Medicine";
    private final double price = 100.0;


    @Override
    public String toHeal() {
       return "Healed inflammation";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
    @Override
    public double getCost(){
        return this.price;
    }

    @Override
    public String getDescription(){
        return "Inflammation Medicine to help with burning sensations and ripped tissues";
    }


}
