package spacefx;

/**
 *
 * @author Dillon
 */
public class Firefly extends Ship {
    /**
    * Constructor for firefly.
    */
    public Firefly() {
        super(20, 170, 100, 25000, 1, 1, 1, 1);
    }

    @Override
    public final String getShipName() {
        return "Firefly";
    }
}
