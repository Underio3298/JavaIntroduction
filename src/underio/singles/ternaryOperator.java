package underio;

public class ternaryOperator {

    public static void main(String[] args) {
        /* TERNARY OPERATOR */


        // Each of these do the same thing
        // The third status assignment is like an if statement in a variable

        int health = 3;
        String status = "";
        System.out.println("What is your status?: " + status);

        if (health > 0) {
            status = "Alive";
        } else {
            status = "Dead";
        }
        System.out.println("What is your status?: " + status);
        status = "";

        status = health > 0 ? "Alive" : "Dead";
        System.out.println("What is your status?: " + status);

    }
}
