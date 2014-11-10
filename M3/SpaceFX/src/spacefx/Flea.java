package spacefx;

/**
 *
 * @author Dillon
 */
public class Flea extends Ship {
    
    public Flea() {
        super(10, 200, 25, 2000, 0, 0, 0, 1);
    }
    
    @Override
    public String getShipName() {
        return "Flea";
    }
}
