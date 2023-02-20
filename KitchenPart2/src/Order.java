/**
 *
 * @author nanajjar
 */
public class Order {

    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;

    /**
     *
     * @param numHamburgers
     * @param numCheeseburgers
     * @param numVeggieburgers
     * @param numSodas
     * @param orderToGo
     * @param orderNum
     */
    public Order(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum) {
        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.numSodas = numSodas;
        this.orderToGo = orderToGo;
        this.orderNum = orderNum;
    }

    /**
     * Get the value of numHamburgers
     *
     * @return the value of numHamburgers
     */
    public int getNumHamburger() {
        return numHamburgers;
    }

    /**
     * Get the value of numCheeseburgers
     *
     * @return the value of numCheeseburgers
     */
    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    /**
     * Get the value of numVeggieburgers
     *
     * @return the value of numVeggieburgers
     */
    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    /**
     * Get the value of numSodas
     *
     * @return the value of numSodas
     */
    public int getNumSodas() {
        return numSodas;
    }

    /**
     * Get the value of orderNum
     *
     * @return the value of orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }
    
    /**
     *
     * @return String representation of an Order details
     */
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers
                + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo
                + ", orderNum=" + orderNum + '}';
    }

}
