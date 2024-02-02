package underio.singles;

public class loops {

    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE) */

        // Outputting all number from 0 to 99. . .
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        System.out.println("---------");

        // FOR

        int forLoopStart = 0;
        int forLoopEnd = 100;

        for (int i = forLoopStart; i <= forLoopEnd; i++) {
            System.out.println(i);
        }

        System.out.println("---------");

        for (int i = 0; i <= 100; i++) { // i is 0, if it is less than 100, add 1
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("---------");

        for (int year = 2000; year <= 3000; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                // System.out.println(year);
            }
        }


        // WHILE

        int health = 10;
        while (health > 0) {
            System.out.println("Player is still alive with "+health+" HP");
            health--;
        }

        // no clue why this does the whole 10 to 1 normally once then does the actual thing
        health = 10;
        while (health > 0) {
            health--;
            if (health == 6) {
                continue;
            }

            if (health == 2) {
                break;
            }
            System.out.println("Player is still alive with "+health+" HP");
        }


    }
}
