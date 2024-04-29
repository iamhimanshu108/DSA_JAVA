

//Create a program to swap two numbers without using a temporary variable.

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int x = 15;
        int y = 0;
        System.out.println("Before Swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);

        // Swap using addition and subtraction
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping");
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);
    }
}
