
//question 1

//java program to swap two numbers.

public class Swap_numbers {

    public static void main(String[] args) {

        int a = 500, b= 100;

        System.out.println("--Before swap--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Value of first is assigned to temporary
        int c= a;

        // Value of second is assigned to first
        a = b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        b= c;

        System.out.println("--After swap--");
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);



//
    }
}