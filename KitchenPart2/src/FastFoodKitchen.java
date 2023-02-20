import java.util.ArrayList;

/**
 *
 * @author nanajjar
 */
public class FastFoodKitchen {

    private ArrayList<Order> orderList = new ArrayList();
    
    private static int nextOrderNum = 1;

    FastFoodKitchen() {
      
    }

    public static int getNextOrderNum() {
        return nextOrderNum;
    }

    private void incrementNextOrderNum() {
        nextOrderNum++;
    }

    // method used to initialize a FastFoodKitchen with an initial set of orders
    public void initializeKitchen() {
        orderList.add(new Order(3, 15, 4, 10, false, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new Order(10, 10, 3, 3, true, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new Order(1, 1, 1, 2, false, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new Order(1, 3, 3, 2, false, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new Order(3, 4, 5, 3, true, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new Order(2, 2, 2, 2, false, getNextOrderNum()));
        incrementNextOrderNum();

    }

   
    // getter/accessor method for the list of orders
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    
    // Part A
    // findOrderSeq method
    public int findOrderSeq(int orderID){
        for (int j = 0; j < nextOrderNum; j++){
            if (orderList.get(j).getOrderNum() == orderID){
                return j;
            }
        }
        return -1;
    }
    
    
    
    // Part B
    // selectionSort method
    public int getSize(int x){
        int sum = 0;
        sum+=orderList.get(x).getNumVeggieburgers();
        sum+=orderList.get(x).getNumCheeseburgers();
        sum+=orderList.get(x).getNumHamburger();
        
        return sum;
        
    }
    public void selectionSort(){
        for (int j=0; j<nextOrderNum-1; j++){
            int minIndex=j;
            for (int k = j+1; k<nextOrderNum-1; k++){
                if (getSize(k)<getSize(minIndex)){
                    minIndex=k;
                }
            }
            Order temp = orderList.get(j);
            orderList.set(j,orderList.get(minIndex));
            orderList.set(minIndex,temp);
            
        }
    }
   
    
    // Part C
    // insertionSort method
    public void insertionSort(){
        for (int j = 1; j<orderList.size();j++){
            Order current = orderList.get(j);
            int i = j-1;
            
            while ((i>-1)&&(orderList.get(i).getOrderNum()>current.getOrderNum())){
                orderList.set(i+1,orderList.get(i));
                i--;
            }
            orderList.set(i+1,current);
        }
    }

    

    // Part D
    // findOrderBin method
    public int findOrderBin(int OrderID){
        int left = 0;
        int right = orderList.size()-1;
        
        while (left<=right){
            int mid = left + (right-left)/2;
            int current = orderList.get(mid).getOrderNum();
            
            if(current==OrderID){
                return mid;
            }
            if(current<OrderID){
                left = mid+1;
            }
            if(current>OrderID){
                right=mid-1;
            }
            
        }
        return -1;
    }
    
}
