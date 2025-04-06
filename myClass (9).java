//calorie counter program challege
import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        //Dsiplaying Welcome Message
        System.out.println("Welcome to Calorie Counter Pro!");
        //Setting up the scanner class
        Scanner scanner = new Scanner(System.in);
        //prompting user for the input, and 
        System.out.println("Enter the name of the first food item: ");
        String foodItemOne = scanner.nextLine();
        System.out.println("Enter the calories for " + foodItemOne + " : ");
        int caloriesF1 = scanner.nextInt();
        scanner.nextLine(); // flushing the input buffer
        System.out.println("Enter the name of the second food item: ");
        String foodItemTwo = scanner.nextLine();
        System.out.println("Enter the calories for " + foodItemTwo + " : ");
        int caloriesF2 = scanner.nextInt();
        scanner.nextLine(); // flushing the input buffer
        System.out.println("Enter the name of the third food item: ");
        String foodItemThree = scanner.nextLine();
        System.out.println("Enter the calories for " + foodItemThree + " : ");
        int caloriesF3 = scanner.nextInt();
        scanner.nextLine(); // flushing the input buffer
        //Presenting the input
        System.out.println("\nYour Calorie Intake: ");
        //1. Rice - 150 calories
        System.out.println("1. " + foodItemOne + " - " + caloriesF1 + " calories");
        System.out.println("1. " + foodItemTwo + " - " + caloriesF2 + " calories");
        System.out.println("1. " + foodItemThree + " - " + caloriesF3 + " calories");
        
        int totalCalorieIntake = caloriesF1 + caloriesF2 + caloriesF3;
        System.out.println("\nTotal Calorie Intake: " + totalCalorieIntake + " calories");
        System.out.println("Thank you for using Calorie Counter Pro!");
        scanner.close();
    }
}
