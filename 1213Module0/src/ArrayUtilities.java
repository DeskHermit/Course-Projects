/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author derek
 */
public class ArrayUtilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String message = "Welcome to ITSC 1213 ArrayUtillities Program!";
        int n = 5;
        for (int i = 0; i<n; i++){
            System.out.println(message);
        }
        
        //test sum
        int[] numArray = {0,2,4,6,17,20,4};
        System.out.println("the sum of the array is: " + sum(numArray));
        System.out.println("the largest number in this array is: " + findMax(numArray));
        System.out.println("the first odd number in this array is: " + findFirstOdd(numArray));
    }
    
    public static int sum(int[] numbers){
        //internalize a variable to hold the total
        int total = 0;
        
        //iterate over the array adding the numbers
        for (int num : numbers){
            total+=num;
        }
        //return calculated total value
        return total;
    }
    
    public static int findMax(int[] numbers){
        //internalize a variable to keep track of max number
        int max = 0;
        
        //iterate over the array checking each number if it larger than value of max
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] > max){
                //new max value found, update variable value
                max = numbers[i];
            }
        }
        //return largest value found
        return max;
    }
    
    public static int findFirstOdd(int[] numbers){
        int i =0;
        while (i<numbers.length){
            if (numbers[i]%2==1){
                //return first odd number found
                return numbers[i];
            }
            i++;
        }
        //if no odd numbers found return 0;
        return 0;
    }
}
