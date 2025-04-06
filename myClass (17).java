
import java.util.Scanner;

public class myClass {
    public static  void main(String args[]) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost price and selling price
        System.out.println("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();

        // Calculate the profit or loss
        //TODO
        double revenue = sellingPrice - costPrice;
        

        // Display the result with relational operators
        //TODO
        if (revenue >= 0 ) {
            double profit = revenue;
        }
        else {
            double loss = revenue;
        }


        // Demonstrate unary operators
        //TODO
        System.out.println("\nDemonstrating Unary Operators:");
        int initialUnitsSold = 10;
        System.out.println("Units sold after increment: " + (++initialUnitsSold));
        System.out.println("Units sold after decrement: " + (--initialUnitsSold));


        // Demonstrate compound operators
        //TODO
        System.out.println("\nDemonstrating Compound Operators:");
        System.out.println("Total revenue after selling " + initialUnitsSold +" units: " + (initialUnitsSold * revenue));

        // Use the modulo operator
        //TODO
        System.out.println("\nDemonstrating Modulo Operator:");
        System.out.println("Remainder when units sold is divided by 3: " + (initialUnitsSold % 3));
        scanner.close();
    }
}
