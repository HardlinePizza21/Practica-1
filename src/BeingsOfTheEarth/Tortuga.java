package BeingsOfTheEarth;
import LivingBeingsPackage.LivingBeings;
public class Tortuga extends LivingBeings implements EarthBeing{

    @Override
    public void caminar() {
        System.out.println("Camino lento");
    }

    @Override
    public void born() {

    }

    @Override
    public void grown() {

    }

    @Override
    public void respaw() {

    }

    @Override
    public void fly() {
        System.out.println("No puedo volar, soy una tortuga");
    }

    @Override
    public void changeDimension() {

    }
}
