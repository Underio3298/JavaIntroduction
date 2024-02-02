package underio;

public class integersAndMath {

    public static void main(String[] args) {

        /* Integer and Math */

        int a = 100;
        int b = 200;


        // ADDITION
        int sum = a+b;
        System.out.println("The sum is: "+sum);


        // SUBTRACTION
        int difference = a-b;
        System.out.println("The difference is: "+difference);


        // MULTIPLICATION
        int product = a*b;
        System.out.println("The product is: "+product);


        // DIVISION
        int quotient = a/b;
        System.out.println("The quotient is: "+quotient);

        quotient = b/a;
        System.out.println("The 2nd quotient is: "+quotient);

        // NO DIVISION BY 0!
        // quotient = b/0;
        // System.out.println("The 3rd quotient is: "+quotient);


        // REMAINDER (MODULO)
        int remainder = 100%2;
        System.out.println("Remainder from 100/2: "+remainder);

        remainder = 100%3;
        System.out.println("Remainder from 100/3: "+remainder);

        remainder = 100%4;
        System.out.println("Remainder from 100/4: "+remainder);


        // SOME MATH METHODS
        System.out.println("Absolute: "+Math.abs(-100));

        System.out.println("Ceiling: "+Math.ceil(1.23)); // Rounding up
        System.out.println("Round: "+Math.round(1.23)); // Rouding
        System.out.println("Floor: "+Math.floor(1.23)); // Rounding down

        System.out.println("Minimum: "+Math.min(10, 200));
        System.out.println("Maximum: "+Math.max(37, 750));
    }
}
