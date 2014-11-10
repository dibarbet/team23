package spacefx;

/**
 *
 * @author Dillon, David Barbet
 */
public class Gnat extends Ship {
    
    public Gnat() {
        super(15, 130, 100, 10000, 1, 0, 1, 1);
    }

    @Override
    public String getShipName() {
        return "Gnat";
    }
}
