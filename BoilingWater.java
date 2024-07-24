import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter a number greater than 212
        System.out.print("Enter a number greater than 212: ");

        //Reading the user's input and converting the string to an integer
        int number = Integer.valueOf(scanner.nextLine());

        //Checking if the number is greater than or equal to 212
        if (number >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling.");
        }
    }
}


