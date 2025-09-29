package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        

        //DO NOT DELETE ANY OF THE CODE BELOW      

                String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent  + "%\n" +
                       "Total tip: $" + Math.round(cost*0.01*percent*100.0)/100.0  + "\n" +
                       "Total Bill with tip: $" + Math.round((cost*0.01*percent+cost)*100.0)/100.0 + "\n" +
                       "Per person cost before tip: $" + (cost/people) + "\n" +
                       "Tip per person: $" + Math.round(cost*0.01*percent/people*100.0)/100.0 + "\n" +
                       "Total cost per person: $" + Math.round((cost*0.01*percent+cost)/people*100.0)/100.0 + "\n" +
                       "-------------------------------\n" +
                       "Items ordered: ";
                    //learned how to round to nearest hundredths from https://stackoverflow.com/questions/8825209/rounding-decimal-points

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner scan = new Scanner(System.in);
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        String itemList = "";
        String item = "";
        while (condition = true) {
            //enter your code here 
            System.out.println("Enter an item name or type '-1' to finish: ");
            item = scan.nextLine();
            if (item == "hi") {
                condition = false;
            }
            else {
                itemList = item + "\n";
            }
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=2; 
        int percent=5;
        double cost=29.56;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
        String result = calculateTip(people, percent, cost);
        System.out.println(result);
        result = extraCredit(people, percent, cost);
        System.out.println(result);
    }
}
        
