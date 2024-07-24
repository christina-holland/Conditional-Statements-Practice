import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter a number between 0 and 100
        System.out.print("Enter your test score (between 0 and 100): ");
        //Reading the user's input and converting the string to an integer
        int score = Integer.valueOf(scanner.nextLine());

        //Determining the grade using conditional statements
            if (score > 100 || score < 0) {
                System.out.println("Invalid score. Enter a number between 0 and 100.");
            } else if (score >= 90) {
                System.out.println("Your grade is an A");
            } else if (score >= 80) {
                System.out.println("Your grade is a B");
            } else if (score >= 70) {
                System.out.println("Your grade is a C");
            } else if (score >= 60) {
                System.out.println("Your grade is a D");
            } else {
                System.out.println("Your grade is an F");
            }
        }
    }

