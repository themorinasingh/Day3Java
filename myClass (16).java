import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        //setting up the Scanner
        Scanner scanner = new Scanner(System.in);
        //taking input
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        boolean result = (a == b);
        System.out.println("a == b is " + result);
        result = (a != b);
        System.out.println("a != b is " + result);
        result = (a > b);
        System.out.println("a > b is " + result);
        result = (a < b);
        System.out.println("a < b is " + result);
        result = (a >= b);
        System.out.println("a >= b is " + result);
        result = (a <= b);
        System.out.println("a <= b is " + result);
    }
}