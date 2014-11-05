package spacefx;

/**
 *
 * @author Dillon
 */
public class Gnat extends Ship {
    
    public Gnat() {
        super(15, 13, 100, 10000, 1, 0, 1, 1);
    }

    @Override
    public String getShipName() {
        return "Gnat";
    }
}
