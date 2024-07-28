package Day2;

public class Operators {
        public static void main(String[] args) {
            int a = 10, b = 5, c;
    
            // Arithmetic Operators
            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
    
            // Relational Operators
            System.out.println("\nRelational Operators:");
            System.out.println("a == b: " + (a == b));
            System.out.println("a != b: " + (a != b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
    
            // Logical Operators
            boolean x = true, y = false;
            System.out.println("\nLogical Operators:");
            System.out.println("x && y: " + (x && y));
            System.out.println("x || y: " + (x || y));
            System.out.println("!x: " + (!x));
    
            // Bitwise Operators
            int p = 6, q = 4; 
            System.out.println("\nBitwise Operators:");
            System.out.println("p & q: " + (p & q)); 
            System.out.println("p | q: " + (p | q)); 
            System.out.println("p ^ q: " + (p ^ q)); 
            System.out.println("~p: " + (~p)); 
            System.out.println("p << 1: " + (p << 1)); 
            System.out.println("p >> 1: " + (p >> 1)); 
    
            // Assignment Operators
            System.out.println("\nAssignment Operators:");
            c = a;
            System.out.println("c = a: " + c);
            c += b;
            System.out.println("c += b: " + c);
            c -= b;
            System.out.println("c -= b: " + c);
            c *= b;
            System.out.println("c *= b: " + c);
            c /= b;
            System.out.println("c /= b: " + c);
            c %= b;
            System.out.println("c %= b: " + c);
    
            // Unary Operators
            System.out.println("\nUnary Operators:");
            System.out.println("++a: " + (++a));
            System.out.println("--b: " + (--b));
    
            // Ternary Operator
            System.out.println("\nTernary Operator:");
            String result = (a > b) ? "a is greater than b" : "a is not greater than b";
            System.out.println(result);
        }
    }
    