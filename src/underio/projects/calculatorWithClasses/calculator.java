package underio.projects.calculatorWithClasses;

public class calculator {
    
    public static void calculate() {
        switch (operator.type) {
            case "*": System.out.println(input.num1 + " " + operator.type + " " + input.num2 + " = " + input.num1 * input.num2); break;
            // exception handling yayyy
            case "/": {
                if (input.num2 == 0) {
                    System.out.println("Division by zero does not work!");
                    System.out.println(input.num1 + " " + operator.type + " " + input.num2 + " = " + 0); break;
                }else {
                System.out.println(input.num1 + " " + operator.type + " " + input.num2 + " = " + input.num1 / input.num2); break;
                }
            }
            case "+": System.out.println(input.num1 + " " + operator.type + " " + input.num2 + " = " + input.num1 + input.num2); break;
            // goofy ahh minus exception
            case "-": {
                int minusAnswer = input.num1 - input.num2;
                System.out.println(input.num1 + " " + operator.type + " " + input.num2 + " = " + minusAnswer); break;
            }
        }
    }
}
