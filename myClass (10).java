//modulo operator
import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        //setting uop scanner;
        Scanner scanner = new Scanner(System.in);
        //prompting user for inout and takin input;
        System.out.println("Enter a number : ");
        int a = scanner.nextInt();
        System.out.println("Enter another number : ");
        int b  = scanner.nextInt();
        //prnting various possiblities
        System.out.print("Addtion: " + (a + b) + "\n");
        System.out.print("Difference: " + (a - b) + "\n");
        System.out.print("Multiply: " + (a * b) + "\n");
        System.out.print("Division: " + (a / b) + "\n");
        //this modulo operation just knocls out the reminder
        System.out.print("Modulo Operation: " + (a % b) + "\n");
        scanner.close();
    }
}