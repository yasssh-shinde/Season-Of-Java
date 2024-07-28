package Day2;

public class nonprimitivedatatypes {
    public static void main(String[] args){
        // 1. String
        String greeting = "Hello, World!";
        System.out.println("Greeting: " + greeting);

        // 2. Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 3. Custom Class
        Person person = new Person("Yash", 22);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }
}

// Custom class example
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
