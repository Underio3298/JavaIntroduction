package underio.complex;

public class Aeroplane implements iFlyable{
    @Override
    public void fly() {
        System.out.println("Plane is blasting into the sky!");
    }
}
