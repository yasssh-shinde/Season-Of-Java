package Day2;

public class Modifiers {

        public static void main(String[] args) {
            // Create an object of the SampleClass
            SampleClass sample = new SampleClass();
    
            // Access public variable
            System.out.println("Public variable: " + sample.publicVar);
    
            // Access default variable
            System.out.println("Default variable: " + sample.defaultVar);
    
            // Access protected variable
            System.out.println("Protected variable: " + sample.protectedVar);
    
            // Access private variable via public method
            System.out.println("Private variable: " + sample.getPrivateVar());
    
            // Access static variable
            System.out.println("Static variable: " + SampleClass.staticVar);
    
            // Access final variable
            System.out.println("Final variable: " + sample.finalVar);
    
            // Call static method
            SampleClass.staticMethod();
    
            // Call non-static method
            sample.nonStaticMethod();
        }
    }
    
    // Sample class demonstrating access and non-access modifiers
    class SampleClass {
        // Access Modifiers
        public int publicVar = 10;
        int defaultVar = 20;  // default access modifier
        protected int protectedVar = 30;
        private int privateVar = 40;
    
        // Non-Access Modifiers
        public static int staticVar = 50;
        public final int finalVar = 60;
    
        // Getter for private var
        public int getPrivateVar() {
            return privateVar;
        }
    
        // Static method
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    
        // Non-static method
        public void nonStaticMethod() {
            System.out.println("This is a non-static method.");
        }
    }
    
    // Abstract class
    abstract class AbstractClass {
        // Abstract method (no body)
        public abstract void abstractMethod();
    
        // Non-abstract method
        public void nonAbstractMethod() {
            System.out.println("This is a non-abstract method.");
        }
    }
    
    // Concrete class extending abstract class
    class ConcreteClass extends AbstractClass {
        // Implementing abstract method
        @Override
        public void abstractMethod() {
            System.out.println("This is the implemented abstract method.");
        }
    }
    