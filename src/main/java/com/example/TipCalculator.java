package com.example;
import java.util.Scanner;

public class TipCalculator {
    public static String calculateTip(int people, int percent, double cost) { 
                String result = "-------------------------------\n" +
                       "Total bill before tip: $"+cost+"\n" +
                       "Total percentage: "+percent+"%\n" +
                       "Total tip: $" + Math.round(cost*0.01*percent*100.0)/100.0  + "\n" +
                       "Total Bill with tip: $" + Math.round((cost*0.01*percent+cost)*100.0)/100.0 + "\n" +
                       "Per person cost before tip: $" + Math.round((cost/people)*100.0)/100.0 + "\n" +
                       "Tip per person: $" + Math.round(cost*0.01*percent/people*100.0)/100.0 + "\n" +
                       "Total cost per person: $" + Math.round((cost*0.01*percent+cost)/people*100.0)/100.0 + "\n" +
                       "-------------------------------\n";
                    //learned how to round to nearest hundredths from https://stackoverflow.com/questions/8825209/rounding-decimal-points
    return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner scan = new Scanner(System.in);
        String result = "-------------------------------\n" +
                "Total bill before tip: $"+cost+"\n" +
                "Total percentage: "+percent+"%\n" +
                "Total tip: $" + Math.round(cost*0.01*percent*100.0)/100.0  + "\n" +
                "Total Bill with tip: $" + Math.round((cost*0.01*percent+cost)*100.0)/100.0 + "\n" +
                "Per person cost before tip: $" + Math.round((cost/people)*100.0)/100.0 + "\n" +
                "Tip per person: $" + Math.round(cost*0.01*percent/people*100.0)/100.0 + "\n" +
                "Total cost per person: $" + Math.round((cost*0.01*percent+cost)/people*100.0)/100.0 + "\n" +
                "-------------------------------\n";
        result += "Items ordered:\n";

        boolean condition = true;
        String item;
        while (condition) {
            item = scan.nextLine();
            if (item.equals("-1")) {
                result += "-------------------------------\n";
                condition = false;
            } else {
                result += item + "\n";
            }
        }
        scan.close();
        return result;
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        int people=2; 
        int percent=5;
        double cost=29.56;              
        String result = extraCredit(people, percent, cost);
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(result);
        
        
    }
}
        
