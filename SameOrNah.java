import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to enter the first word
        System.out.print("Enter the first word: ");
        //Reading the user's input
        String word1 = scanner.nextLine();

        //Prompting the user to enter the second word
        System.out.print("Enter the second word: ");
        //Reading the user's input
        String word2 = scanner.nextLine();

        //Checking if the words are the same or different using String.equalsIgnoreCase()
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}

