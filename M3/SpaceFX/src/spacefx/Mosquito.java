package spacefx;

/**
 *
 * @author Dillon
 */
public class Mosquito extends Ship {
    
    public Mosquito() {
        super(15, 13, 100, 30000, 2, 1, 1, 1);
    }
    
    @Override
    public String getShipName() {
        return "Mosquito";
    }
}
