import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Getting user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input: Getting user age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output: Greeting the user
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        // Conditional: Check if the user is an adult
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Loop: Print numbers from 1 to 5
        System.out.println("Here are the numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Array: Basic array operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        System.out.println("Sum of numbers in the array:");
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}