//Playing around with increment and decrement operatiors
public class myClass {
    public static void main ( String args[] ) {
        int a = 10;
        //a gets updated after it is printed
        //post decrement and increment
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        
        //pre decrement and increment 
        //here a gets updated before it gets printed
        System.out.println(++a);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);
    }
}