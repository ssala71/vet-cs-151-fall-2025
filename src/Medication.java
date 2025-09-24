public abstract class Medication implements Service{
    /** There's no reason to re-modify the medication names and price */
    public abstract String toHeal();

    public abstract double getCost();

    public abstract String getDescription();

    
    
}
