package underio;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        // create the scanner
        Scanner scanner = new Scanner(System.in);

        // text prompt
        System.out.println("How old are you");
        // set an integer as input
        int age = scanner.nextInt();
        // output text + age input
        System.out.println("You are "+age+ " years old!");

        // REMEMBER TO TRY CLEARING THE SCANNER IF IT DOES NOT WORK/SKIPS INPUT
        scanner.nextLine();

        // text prompt
        System.out.println("State your name");
        // set a string as input
        String name = scanner.nextLine();
        // output text + name input variable
        System.out.println("Welcome "+name);

    }
}