package spacefx;

/**
 *
 * @author Dillon
 */
public class Firefly extends Ship {
    
    public Firefly() {
        super(20, 17, 100, 25000, 1, 1, 1, 1);
    }
    
    public String getShipType() {
        return "Firefly";
    }
}