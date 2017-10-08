import java.util.HashMap;
import java.util.Scanner;

public class JavaQuiz {

    public static void startJavaQuiz() {
        System.out.println("Ready for a quiz");
        question1();
        question2();
        question3();
        question4();
        question5();
        System.out.println("Thanks for playing");
        System.out.println("If you would like to switch to java trainer press 1 if you'd like to retake the quiz press 2 or 3 to quit");
    }

    public static void question1()
    {
        int num=0;
            System.out.println("Choose an appropriate data type for the following: isSwimmer: ");
            System.out.println("1. Int ");
            System.out.println("2. Long ");
            System.out.println("3. String ");
            System.out.println("4. Boolean ");
            num = userINPUT();
            if(num != 4)
            {
                System.out.println("You got the first question wrong jeeeze");
            }else System.out.println("Good job");
        System.out.println("Get ready for the next question.");
        System.out.println("=========================================================");
    }

    public static void question2()
    {
        int num = 0;
        System.out.println("Question 2: What is the size of char in Java?");
        HashMap<Integer , String > newMap = new HashMap<Integer, String>();
        newMap.put(1, "1. 4 bits");
        newMap.put(2, "2. 6 bits");
        newMap.put(3, "3. 7 bits");
        newMap.put(4, "4. 16 bits");
        for( int keys : newMap.keySet())
        {
            System.out.println(newMap.get(keys));
        }
        num = userINPUT();
        if (num != 4 ) {
            System.out.println("Next question Moving on");
        }else{
            System.out.println("Correct a Char is 2 Bytes which converts to 16 bits");
            System.out.println("Next question");
        }
        System.out.println("=========================================================");
    }
    public static void question3()
    {
        int num = 0;
        System.out.println("Question 3: This line of code int num = 6.7; will result in");
        HashMap<Integer , String > newMap = new HashMap<Integer, String>();
        newMap.put(1, "1. Compilation error");
        newMap.put(2, "2. Runtime error");
        newMap.put(3, "3. num = 6.7 ");
        newMap.put(4, "4. num = 6 ");
        for( int keys : newMap.keySet())
        {
            System.out.println(newMap.get(keys));
        }
        num = userINPUT();
        if (num == 4||num == 2|| num == 3) {
            newMap.replace(num, newMap.get(num), "You need to study next question");
            System.out.println(newMap.get(num));
        }else{
            System.out.println("Correct 6.7 is a double type and will not be accepted into a int variable");
            System.out.println("Next question");
        }
        System.out.println("=========================================================");
    }
    public static void question4()
    {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        boolean isValid = false;
        System.out.println("Question 4: What will this statement print?\n String word = \"ABCDE\";\n for(int i=0; i<4; i+=2) ");
        HashMap<Integer , String > newMap = new HashMap<Integer, String>();
        newMap.put(1, "1. ab");
        newMap.put(2, "2. ac");
        newMap.put(3, "3. ace ");
        newMap.put(4, "4. bd");
        for( int keys : newMap.keySet())
        {
            System.out.println(newMap.get(keys));
        }
        num = userINPUT();
        if (num == 1||num == 4|| num == 3) {
            newMap.replace(num, newMap.get(num), "Please go over the material next question");
            System.out.println(newMap.get(num));
        }else{
            System.out.println("Correct since your iterating by 2 you will print position 0 and position 2 but since the limit is 4 you will not print letter in position 4");
            System.out.println("Next question");
        }
        System.out.println("=========================================================");
    }

    public static void question5()
    {
        int num = 0;
        System.out.println("Question 5: Which one is not correct ");
        HashMap<Integer , String > newMap = new HashMap<Integer, String>();
        newMap.put(1, "1. A class needs to be instantiated as an Object before being used");
        newMap.put(2, "2. Objects exists in memory in run time");
        newMap.put(3, "3. Class and object are different names for the same thing");
        newMap.put(4, "4. An object is a variable where The type is the class used to declare the variable ");
        for( int keys : newMap.keySet())
        {
            System.out.println(newMap.get(keys));
        }
       num = userINPUT();
        if (num == 1||num == 4|| num == 3) {
            newMap.replace(num, newMap.get(num), "Ahh better luck next time.");
            System.out.println(newMap.get(num));
        }else{
            System.out.println("Correct an object is either a member or instance of a class");
            System.out.println("All done way to go");
        }
        System.out.println("=========================================================");
    }

    public static int userINPUT()
    {
        Scanner keyboard = new Scanner(System.in);
        int switchLoop = 0;
        int num = 0;
        do{
            try {
                num = Integer.parseInt(keyboard.next());
            } catch (NumberFormatException e) {
                System.out.println("error");
                System.out.println();
                userINPUT();
            }
            switch (num)
            {
                case 1:
                    num = 1;
                    switchLoop++;
                    break;
                case 2:
                    num =2;
                    switchLoop++;
                case 3:
                    num =3;
                    switchLoop++;
                    break;
                case 4:
                    num =4;
                    switchLoop++;
                    break;
                default: System.out.println("Invalid input try again.");
            } }while (switchLoop == 0);
        return num;
    }
}
