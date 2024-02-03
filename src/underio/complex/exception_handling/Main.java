package underio.complex.exception_handling;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Exceptions & Try And Catch */

        int x = 10;
        try {
            x = 100 / 0;
        } catch (Exception e) {
            System.out.println("Exception Caught! " + e.getMessage());
        }

        System.out.println("something important");

        if (x < 100) {
            throw new Exception("some piece oof code is broke");
        }

    }
}
