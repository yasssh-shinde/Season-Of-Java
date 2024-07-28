package Day2;

public class ConditionalStatements {
    public static void main(String[] args) {
        // 1. Conditional Statements
        int x = 10;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        // 2. for loop
        System.out.print("for loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. while loop
        System.out.print("while loop: ");
        int y = 0;
        while (y < 5) {
            System.out.print(y + " ");
            y++;
        }
        System.out.println();

        // 4. do-while loop
        System.out.print("do-while loop: ");
        int z = 0;
        do {
            System.out.print(z + " ");
            z++;
        } while (z < 5);
        System.out.println();

        // 5. switch statement
        int day = 4;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);
    }
}
