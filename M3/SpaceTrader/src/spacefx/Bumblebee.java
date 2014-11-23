package spacefx;

/**
 *
 * @author Dillon
 */
public class Bumblebee extends Ship {
    
    public Bumblebee() {
        super(25, 200, 100, 60000, 1, 2, 2, 2);
    }
    
    @Override
    public String getShipName() {
        return "Bumblebee";
    }
}
