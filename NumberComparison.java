import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        //Reading the user's input and converting the string to an integer
        int number1 = Integer.valueOf(scanner.nextLine());

        //Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        //Reading the user's input and converting the string to an integer
        int number2 = Integer.valueOf(scanner.nextLine());

        //Comparing the two numbers using conditional statements
        if (number1 == number2) {
            System.out.println("Numbers are the same");
        } else if (number1 > number2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}

