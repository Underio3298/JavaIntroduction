package underio.projects;

import java.util.Scanner;

public class betterCalculator {
    public static void main(String[] args) {
        /* CALCULATOR | Exercise 2
         *
         * Create a Calculator similar to the first exercise!
         * However, this time use at least two custom methods (one for evaluating the operation and one for continuing)!
         *
         * Additionally, make sure if a Dividing by 0 would happen, you catch that and just return a 0 instead!
         *
         */

        System.out.println("Welcome to the calculator!");
        calculate();
    }
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation would you like to use? (* / + -): ");
        String operation = scanner.nextLine();
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        switch (operation) {
            case "*": System.out.println(num1 + " * " + num2 + " = " + num1 * num2); break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0 (Division by 0 does not work!)"); break;
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + num1 / num2); break;
                }

            case "+": System.out.println(num1 + " + " + num2 + " = " + num1 + num2); break;
            // goofy minus exception
            case "-":
                int minusAnswer = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + minusAnswer);
                break;
        }
        askIfContinue();
    }

    public static void askIfContinue() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue? (yes/no)");
        String wantToContinue = scanner.nextLine();
        switch (wantToContinue) {
            case "yes", "y": calculate(); break;
            case "no", "n": System.out.println("Thank you for using the calculator!");break;
            default: {
                System.out.println("Please enter either yes or no.");
                askIfContinue();
            }
        }


    }
}
