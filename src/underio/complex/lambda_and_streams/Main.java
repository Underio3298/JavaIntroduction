package underio.complex.lambda_and_streams;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        helloWorld();

        Runnable runnable = () -> System.out.println("Hello World!");
        somethingCool(runnable);
        somethingCool(Main::helloWorld);

        Supplier<Float> pi = () -> 3.14159f;
    }

    public static void helloWorld(){
        System.out.println("Hello World!");
    }

    public static void somethingCool(Runnable runnable) {
        runnable.run();
    }
}
