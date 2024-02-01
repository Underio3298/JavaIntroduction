package underio.projects.calculatorWithClasses;

import java.util.Scanner;

public class Main {
    /* EXERCISE 3 - Calculator with Classes
     *
     * Create the same Calculator application that we had before!
     *
     * This time however, make classes for each operation. Make a custom Interface that all of them implement!
     * Also make a Calculator class which deals with the calculation itself.
     *
     *
     */
    public static void main(String[] args) {
        boolean askIfContinueBoolean = true; 
        Scanner scanner = new Scanner(System.in);
        operator multiplication = new operator("*");
        operator division = new operator("/");
        operator addition = new operator("+");
        operator subtraction = new operator("-");
        
        System.out.println("Welcome to the calculator with classes!");

        while (askIfContinueBoolean == true) {
            input.getInput();
            calculator.calculate();
            System.out.println("Would you like to calculate something else?");
            String askIfContinueInput = scanner.nextLine();
            switch (askIfContinueInput) {
                case "yes", "y": askIfContinueBoolean = true; break;
                case "no", "n": askIfContinueBoolean = false; break;
            }
        }
    }
}
