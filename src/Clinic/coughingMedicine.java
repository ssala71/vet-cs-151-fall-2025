package Clinic;


public class coughingMedicine extends Medication implements Service{
/** There's no reason to re-modify the medication names and price */
    private final String medicationName = "CoughMedicine";
    private double price = 50.0;
    //35% off
    private final double medicalInsurance = .65;
    private boolean hasInsurance = true;
    
    public coughingMedicine() {
        super("Coughing Medication", 50.0,30); 
    }

    @Override
    public String toHeal() {
       return "Healed coughing";
    }

    //still need to consider insurance. or maybe do insurance after the final cost
    public double getCost(){
        if (hasInsurance){
            price = price * medicalInsurance;
        }
        return getPrice();
    }

    @Override
    public void refillOrder() {
        if (getStock() == 1){
            System.out.println("Refilling Doses!");
            setStock(30);
        }
    }
    @Override
    public String getDescription() {
        return "Medication for treating pets with coughing symptoms";
    }
    
}
