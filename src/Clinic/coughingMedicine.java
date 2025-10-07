package Clinic;


public class coughingMedicine extends Medication implements Service{
/** There's no reason to re-modify the medication names and price */
    private final String medicationName = "CoughMedicine";
    private final double price = 50.0;


    @Override
    public String toHeal() {
       return "Healed coughing";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
    public double getCost(){
        return this.price;
    }
    
}
