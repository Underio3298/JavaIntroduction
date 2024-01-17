package underio.projects;

import java.util.Scanner;

public class easyCalculator {

    public static void main(String[] args) {
        // EASY CALCULATOR (exercise 1)

        /* EXERCISE 1: Easy Calculator
         *
         * Create a Calculator that runs multiple times until you manually break out of it.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * Please note that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something");
         * and not ==
         *
         * After the result has been output, ask the user if they want to continue, if not end the program!
         * Estimated Time: 30-45 minutes
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        while (true) {
            // chose operation
            System.out.println("Which operation would you like to use? (* / + -)");
            String operation = scanner.nextLine();

            // enter the first number
            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();

            // enter the second number
            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();

            // Checking which operation was inputted and giving answer
            if (operation.equals("*")) {
                int answer = firstNumber * secondNumber;
                System.out.println("The product of "+firstNumber+" multiplied "+secondNumber+" is "+answer+"!");
            }

            if (operation.equals("/")) {
                int answer = firstNumber / secondNumber;
                System.out.println("The quotient of "+firstNumber+" divided by "+secondNumber+" is "+answer+"!");
            }

            if (operation.equals("+")) {
                int answer = firstNumber + secondNumber;
                System.out.println("The sum of "+firstNumber+" plus "+secondNumber+" is "+answer+"!");
            }

            if (operation.equals("-")) {
                int answer = firstNumber - secondNumber;
                System.out.println("The difference between "+firstNumber+" and "+secondNumber+" is "+answer+"!");
            }

            scanner.nextLine();

            // asking if user want to run the calculator again
            while (true){
                System.out.println("Would you like to continue? (yes/no)");
                String runAgain = scanner.nextLine();

                if (runAgain.equals("yes")) {
                    break;
                } else if (runAgain.equals("no")) {
                    scanner.close();
                    System.exit(0);
                } else {
                    System.out.println("Invalid input!");
                }
            }


        }



    }
}
