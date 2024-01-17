package underio;

public class assingmentOperators {

    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: "+mana);

        // ADDITION +=
        mana += 20; // mana = mana + 20;
        System.out.println("Mana: "+mana);

        mana++; // mana = mana + 1;
        System.out.println("Mana: "+mana);

        // SUBTRACTION -=
        mana -= 60; // mana = mana - 60;
        System.out.println("Mana: "+mana);

        mana--; // mana = mana - 1;
        System.out.println("Mana: "+mana);

        // MULTIPLY *=
        mana *= 2; // mana = mana * 2;
        System.out.println("Mana: "+mana);

        // DIVIDE /=
        mana /= 4; // mana = mana / 4
        System.out.println("Mana: "+mana);

        // MODULO %=
        mana %= 2; // divide by 2 and output remainder
        boolean manaEven = mana == 0;
        System.out.println("Mana: "+mana);
        System.out.println("Is mana even? "+manaEven);

    }
}
