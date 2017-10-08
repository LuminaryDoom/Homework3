
import java.util.Scanner;
/**
 * This is Java Master, a program that will help you train.
 */
public class Main {
    public static void main(String[] args) {
        promptUserInput();
        Scanner scanner = new Scanner(System.in);
        startProgram(scanner);
    }
    private static void promptUserInput() {
        System.out.println("Welcome to Java Master Please select one of the following.");
        System.out.println("1: Java Glossary: Input a term for its definition.");
        System.out.println("2: Java-Quiz: Answer 5 corrections!");
    }
    private static void startProgram(Scanner scanner) {
        while (scanner.hasNext()) {
            boolean quit = false;
            int choice = 0;
            String error = "Invalid input";
            try {
                choice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println(error);
                System.out.println();
                promptUserInput();
            }
            if (choice > 0 && choice <= 3) {
                if (choice == 1) {
                    System.out.println("Selected Java Glossary");
                    JavaGlossary.startJavaGlossary();
                    System.out.println();
                    System.out.println("Welcome back to Java Master");
                } else if (choice == 2) {
                    System.out.println("selected java quiz");
                    JavaQuiz.startJavaQuiz();
                } else if (choice == 3) {
                    System.out.println("Thanks for playing, See you next time!");
                    quit = true;
                } else if (choice > 3) {
                    System.out.println("Please enter a valid number.");
                    promptUserInput();
                } else {
                    continue;
                }
                if (quit) {
                    break;
                }
            }
        }
    }
}