///fixing the inout pbffer problem, my take

import java.util.Scanner;

public class myClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        String caughtInScanning = scanner.nextLine(); ///this ca
        System.out.println("Enter You name, you beautiful human: ");
        String name = scanner.nextLine();
        System.out.print(a + caughtInScanning + name);
        scanner.close();
    }
}