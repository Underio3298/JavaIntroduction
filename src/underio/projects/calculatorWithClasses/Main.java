package underio.projects.calculatorWithClasses;
// TODO: figure out how the hell to do this
public class Main {
    /* EXERCISE 3 - Calculator with Classes
     *
     * Create the same Calculator application that we had before!
     *
     * This time however, make classes for each operation. Make a custom Interface that all of them implement!
     * Also make a Calculator class which deals with the calculation itself.
     *
     *
     */
    public static void main(String[] args) {
        operator multiplication = new operator("x");
        operator division = new operator("/");
        operator addition = new operator("+");
        operator subtraction = new operator("-");
        
        System.out.println("Welcome to the calculator with classes!");
        
    }
}
