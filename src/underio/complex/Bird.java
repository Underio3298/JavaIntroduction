package underio.complex;

public class Bird extends Animal implements iFlyable{
    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Singing");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
