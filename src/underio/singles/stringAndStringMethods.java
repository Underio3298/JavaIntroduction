package underio.singles;

import java.util.Scanner;

public class stringAndStringMethods {

    public static void main(String[] args) {
        /* STRING AND STRING METHODS */

        String name = "aaron";
        String occupation = "YouTube";

        occupation = occupation + "r";

        System.out.println("My name is " + name + " and I am a " + occupation);


        String sentence = "Hello, how are you doing?";
        System.out.println(sentence);

        // Upper Case and/or Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"are\"?: " + sentence.contains("are"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy"));

        // charAt
        System.out.println(sentence.charAt(7));

        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();

        System.out.println(test.equals("Hello"));




    }
}
