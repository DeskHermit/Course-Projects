
import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derek
 */

public class FastFoodKitchen {

    private static ArrayList<Order> orderList = new ArrayList<>();
    private static int nextOrderNum = 1;
    
    /**
     *
     */
    public FastFoodKitchen(){
        
        Order order1 = new Order(3, 5, 4, 10, true ,nextOrderNum);
        incrementNextOrderNum();
        Order order2 = new Order(0,0,3,3,false,nextOrderNum);
        incrementNextOrderNum();
        Order order3 = new Order(1,1,0,2,false,nextOrderNum);
        incrementNextOrderNum();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        
    }
    
    /**
     *
     * @param int orderI
     * @return boolean
     */
    public boolean isOrderDone(int orderI){
       for (int i = 0; i<orderList.size()+1; i++){
           if (i==(orderI)){
               return true;
           }
       }
       return false;
    }
    
    /**
     *
     * @param int orderI
     * @return boolean
     */
    public boolean cancelOrder(int orderI){
       for (int i = 0; i<orderList.size()+1; i++){
           if (i==orderI){
               orderList.remove(orderI-1);
               return true;
           }
       }
       return false;
    }
    
    /**
     *
     * @param int ham
     * @param int cheese
     * @param int veggie
     * @param int soda
     * @param int toGo
     * @return int nextOrderNum
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        Order newOrder = new Order(ham,cheese,veggie,soda,toGo,nextOrderNum);
        //incrementNextOrderNum();
        orderList.add(newOrder);
        return nextOrderNum;
    }
    
    /**
     *
     * @return boolean
     */
    public boolean cancelLastOrder(){
        if (orderList.size()>=1){
            orderList.remove(orderList.size()-1);
            nextOrderNum = orderList.size()-1;
            return true;
        }
        return false;
    }
            
    /**
     *
     * @return int numOrdersPending
     */
    public int getNumOrdersPending(){
        return orderList.size();
    }
    
    /**
     *
     * @return int nextOrderNum
     */
    public int getNextOrderNum(){
        return nextOrderNum;
    }
    
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
}
