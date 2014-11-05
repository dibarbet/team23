package spacefx;

/**
 *
 * @author Dillon
 */
public class Bumblebee extends Ship {
    
    public Bumblebee() {
        super(25, 16, 100, 60000, 1, 2, 2, 2);
    }
    
    public String getShipType() {
        return "Bumblebee";
    }
}
