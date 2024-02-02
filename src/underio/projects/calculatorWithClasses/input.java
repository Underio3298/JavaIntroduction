package underio.projects.calculatorWithClasses;

import java.util.Scanner;

public class input {

    public static int num1;
    public static int num2;

    public static void getInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter the operation you would like to use: (*, /, +, -)");
        scanner.nextLine();
        operator.type = scanner.nextLine();
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();
    }

    
}
