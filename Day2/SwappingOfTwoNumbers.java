package Day2;

public class SwappingOfTwoNumbers {
        public static void main(String[] args) {
            int a = 5, b = 10;
            System.out.println("Before swapping: a = " + a + ", b = " + b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }
    