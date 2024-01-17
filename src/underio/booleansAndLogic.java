package underio;

import java.util.Scanner;

public class booleansAndLogic {
    public static void main(String[] args) {
        /* BOOLEANS AND LOGIC */


        // Booleans are either true (1) or false (0)
        boolean goodGame = true;
        boolean boughtDLC = false;
        System.out.println("minecraft dungeons is a good game "+goodGame);

        boolean isCreative = false;
        System.out.println("Player is in creative mode: "+isCreative);


        // COMPARISONS (< <= >= > == !=)
        int points = 75;
        int pointsToPass = 70;
        boolean hasPassedTest = points >= pointsToPass;
        System.out.println("Student has passed the test: "+hasPassedTest);

        int health = 0;
        boolean isAlive = health > 0;
        System.out.println("Player is alive: "+isAlive);


        /* LOGIC (AND, OR, NOT) */

        // OR (||)
        // a | b | c

        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND (&&)
        // a | b | c

        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT (!)
        // a | !a

        // 0 |  1
        // 1 |  0

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2; // true if BOTH are true!

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Are you from Europe? Answer true or false.");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean canDrink = isEuropean && age >= euDrinkingAge || !isEuropean && age >= usDrinkingAge;
        System.out.println("Can user drink?: "+canDrink);

    }
}
