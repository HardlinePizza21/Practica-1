package BeingsOfTheEarth;
import SkyBeings.SkyBeing;
import LivingBeingsPackage.LivingBeings;
public class Human extends LivingBeings implements EarthBeing, SkyBeing{



    public Human(String nombre){
        super(nombre);
    }

    @Override
    public void fly() {
        System.out.println("El humano " + this.nombre + " puede volar en avion");
    }

    @Override
    public void changeDimension() {
        System.out.println("Cambio de dimension con maquinas");
    }

    @Override
    public void born() {
        System.out.println("Nacio un humano");
    }

    @Override
    public void grown() {
        this.edad++;
        System.out.println("El humano crecio un año");
    }

    @Override
    public void respaw() {
        System.out.println("Volvio a la vida como un zombie");
    }
}
