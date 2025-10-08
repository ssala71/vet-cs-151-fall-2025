package Clinic;


public class coughingMedicine extends Medication implements Service{
/** There's no reason to re-modify the medication names and price */
    public coughingMedicine() {
        super("Coughing Medication", 50.0,30); 
    }

    @Override
    public String toHeal() {
       return "Healed coughing";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
    public double getCost(){
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Medication for treating coughing symptoms.";
    }
    
}
