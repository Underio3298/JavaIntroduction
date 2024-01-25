package underio.projects.calculatorWithClasses;

import java.util.Scanner;

public class input {

    public int num1;
    public int num2;
    public int answer;

    public void getInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter the operation you would like to use: (x, /, +, -)");
        operator.type = scanner.nextLine();
    }

    
}
