package underio;

public class castingVariables {

    public static void main(String[] args) {
        /* CASTING */

        // Turning one data type into another
        int health = 10;
        float damage = 1.5f;

        // int result = health - damage;
        float resultFloat = health - damage; // Implicit Cast!
        System.out.println(resultFloat); // 8.5

        int resultInteger = health - (int)damage; // explicitly casting damage from float to int
        System.out.println(resultInteger);

        resultInteger = (int)((float)health - damage); // health gets turned into a float then result becomes an integer
        System.out.println(resultInteger);

        String point = "100";
        System.out.println(point + 5); // 5 gets added to the output not the variable (because here we are doing "100" + 5 = "100"5/1005

        int result = Integer.parseInt(point) + 5; // String gets converted into an integer using Integer.parseInt(variable)
        System.out.println(result);


    }
}
