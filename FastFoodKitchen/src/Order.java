/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
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
     * @param hamburg
     * @param cheburg
     * @param vegburg
     * @param soda
     * @param toGo
     * @param ordNum
     */
    public Order(int hamburg, int cheburg, int vegburg, int soda, boolean toGo, int ordNum){
        numHamburgers = hamburg;
        numCheeseburgers = cheburg;
        numVeggieburgers = vegburg;
        numSodas = soda;
        orderToGo = toGo;
        orderNum = ordNum;
    }
    
    /**
     *
     * @return int numHamburgers
     */
    public int getNumHamburgers(){
        return numHamburgers;
    }
    
    /**
     *
     * @param int num
     */
    public void setNumHamburgers(int num){
        if (num>=0){
            numHamburgers = num;
        }
        else{
            System.out.println("Error! The number of hamburgers cannot be less than 0");
        }
    }
    
    /**
     *
     * @return int numCheeseburgers
     */
    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }
    
    /**
     *
     * @param int num
     */
    public void setNumCheeseburgers(int num){
        if (num>=0){
            numCheeseburgers = num;
        }
        else{
            System.out.println("Error! The number of cheeseburgers cannot be less than 0");
        }
    }
    
    /**
     *
     * @return int numVeggieburgers
     */
    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }
    
    /**
     *
     * @param int num
     */
    public void setNumVeggieHamburgers(int num){
        if (num>=0){
            numVeggieburgers = num;
        }
        else{
            System.out.println("Error! The number of veggieburgers cannot be less than 0");
        }
    }
    
    /**
     *
     * @return in numSodas
     */
    public int getNumSodas(){
        return numSodas;
    }
    
    /**
     *
     * @param int num
     */
    public void setNumSodas(int num){
        if (num>=0){
            numSodas = num;
        }
        else{
            System.out.println("Error! The number of sodas cannot be less than 0");
        }
    }
    
    /**
     *
     * @return boolean orderToGo
     */
    public boolean isOrderToGo(){
        return orderToGo;
    }
    
    /**
     *
     * @param boolean toGo
     */
    public void setOrderToGo(boolean toGo){
        orderToGo = toGo;
    }
    
    /**
     *
     * @return int orderNum
     */
    public int getOrderNum(){
        return orderNum;
    }
    
    /**
     *
     * @param int num
     */
    public void setOrderNum(int num){
        orderNum = num;
    }
    
    
}
