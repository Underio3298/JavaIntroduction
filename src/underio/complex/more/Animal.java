/**
 * This is a class that represents an animal.
 *
 * @author Underio
 * @version 1.0
 */
package underio.complex.more;

public abstract class Animal {

    /**
     * This is a string that represents the picture of the animal.
     */
    public String picture;

    /**
     * This is a string that represents the name of the animal.
     */
    protected String name;

    /**
     * This is an integer that represents the age of the animal.
     */
    private int age;

    /**
     * This is the constructor for the Animal class.
     *
     * @param picture This is a string that represents the picture of the animal.
     * @param name This is a string that represents the name of the animal.
     * @param age This is an integer that represents the age of the animal.
     */
    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    /**
     * This is an abstract method that represents the movement of the animal.
     */
    public abstract void move();

    /**
     * This is a method that represents the making of the animal sound.
     */
    public void makeSound() {
        System.out.println("whatever animal sound");
    }

    /**
     * This is a method that represents the displaying of the information of the animal.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Image: " + picture);
    }

    /**
     * This is a method that represents the getting of the age of the animal.
     *
     * @return This is an integer that represents the age of the animal.
     */
    public int getAge() {
        return age;
    }

    /**
     * This is a method that represents the animal birthday.
     */
    public void birthday() {
        age++;
        System.out.println(name + " is celebrating their birthday! They turned " + age);
    }

}