//fixing the inout problem in the scanner, by flushing the buffer
import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name, you " + age + " old human:");
        
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        scanner.close();
    }
}