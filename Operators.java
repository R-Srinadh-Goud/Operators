 



public class Operators {
    public static void main(String[] args) {
        int x = 10, y = 5;
        
        // Arithmetic operations
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Division: " + (x / y));
        
        // Relational checks
        System.out.println("x equals y? " + (x == y));
        System.out.println("x is greater than y? " + (x > y));
        
        // Logical conditions
        System.out.println("x > y and y > 0? " + ((x > y) && (y > 0)));
        System.out.println("x > y or y < 0? " + ((x > y) || (y < 0)));
    }
}
