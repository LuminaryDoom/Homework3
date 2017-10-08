
import java.util.HashMap;
import java.util.Scanner;
public class JavaGlossary {
    private static HashMap<String, String> javaGlossary = new HashMap<>();
    static void startJavaGlossary() {
        initializeMap();
        promptUserInput();
        startProgram();
    }
    private static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String userTerm = scanner.next();
            if (userTerm.toLowerCase().equals("quit") || userTerm.equals("0")) {
                System.out.println("Thanks for playing");
                break;
            }
            if (javaGlossary.containsKey(userTerm)) {
                System.out.println(javaGlossary.get(userTerm));
                System.out.println("Please select another term to look up.");
            } else {
                System.out.println("Term is not in Java Glossary, would you like to add or y/n?");
                String userAnswer = scanner.next();
                if (userAnswer.toLowerCase().equals("y")) {
                    //add to map
                    System.out.println("Enter a term: ");
                    String key = scanner.next().toLowerCase();
                    System.out.println("Enter a definition: ");
                    String value = scanner.next().toLowerCase();
                    javaGlossary.put(key, value);
                    System.out.println("Term added to the dictionary");
                    promptUserInput();
                } else {
                    System.out.println("Would you like to quit?");
                    String answer = scanner.next();
                    if (answer.toLowerCase().equals("y")) {
                        break;
                    } else {
                        System.out.println("Restarting the program!");
                        promptUserInput();
                    }
                }
            }
        }
    }
    private static void initializeMap() {
        javaGlossary = new HashMap<>();
        javaGlossary.put("array", "A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer.");
        javaGlossary.put("bit", "The smallest unit of information in a computer, with a value of either 0 or 1.");
        javaGlossary.put("block", "In the Java programming language, any code between matching braces. Example: { x = 1; }.");
        javaGlossary.put("double", "A Java keyword used to define a variable of type double.\n");
        javaGlossary.put("field", "A data member of a class. Unless specified otherwise, a field is not static. \n");
        javaGlossary.put("float", "A Java keyword used to define a floating point number variable. \n");
        javaGlossary.put("instance", "An object of a particular class. In programs written in the Java programming language, an instance of a class is created using the new operator followed by the class name. \n");
        javaGlossary.put("inheritance", "The concept of classes automatically containing the variables and methods defined in their supertypes . See also superclass , subclass . \n");
    }
    private static void promptUserInput() {
        System.out.println("////////////////////////////////");
        System.out.println("Starting Java Glossary! Enter 0 or \"quit\" to exit game.");
        System.out.println("");
        System.out.println("Welcome to the Java Glossary, a mini glossary for java beginners!");
        System.out.println("Please enter a Java term you would like to learn...");
    }
}