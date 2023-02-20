
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nanajjar
 */
public class Main {

    public static void main(String[] args) {

        // create a FastFoodKitchen object
        FastFoodKitchen kitchen = new FastFoodKitchen();
        
        // initialize this FastFoodKitchen object with some orders
        kitchen.initializeKitchen();
        
        // verify FastFoodKitchen object has orders
        int numberOfOrders = kitchen.getOrderList().size();
        System.out.println("current number of orders " + numberOfOrders);
        
        
        // TEST PART A - findOrderSeq
        int orderPosition = kitchen.findOrderSeq(2);
        System.out.println("Using sequential search >> order position is " + orderPosition);
        
        System.out.println("");
        // TEST PART B -  BselectionSort method
        kitchen.selectionSort();
        ArrayList<Order> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for (Order order : sortedOrders){
            orderSize = order.getNumCheeseburgers() + order.getNumHamburger() + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        }
        
        System.out.println("");
        // TEST PART C - insertionSort method
        kitchen.insertionSort();
        ArrayList<Order> sortedOrders2 = kitchen.getOrderList();
        int orderSize2 = 0;
        for (Order order : sortedOrders2){
            orderSize = order.getNumCheeseburgers() + order.getNumHamburger() + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        }
        
        System.out.println("");
       // TEST PART D - findOrderBin method
        System.out.println("Enter a order number: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (kitchen.findOrderBin(x)==-1){
            System.out.println("That order is not in the system.");
        }
        else{
            System.out.println("Your order was found at position "+kitchen.findOrderBin(x));
        }
        
       
    
    
    }

}
