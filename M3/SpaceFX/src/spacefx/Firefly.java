package spacefx;

/**
 *
 * @author Dillon
 */
public class Firefly extends Ship {
    
    public Firefly() {
        super(20, 170, 100, 25000, 1, 1, 1, 1);
    }
    
    @Override
    public String getShipName() {
        return "Firefly";
    }
}
