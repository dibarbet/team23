package spacefx;

/**
 *
 * @author Pete
 */
public class Flea extends Ship {
    
    public Flea() {
        super(10, 20, 25, 2000, 0, 0, 0, 1);
    }
    
    public String getShipType() {
        return "Flea";
    }
}
