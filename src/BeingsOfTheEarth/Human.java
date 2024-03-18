package BeingsOfTheEarth;
import SkyBeings.SkyBeing;
import LivingBeingsPackage.LivingBeings;
public class Human extends LivingBeings implements EarthBeing, SkyBeing{


    public Human(String nombre){
        super(nombre);
    }

    public Human(){

    }

    @Override
    public void fly() {
        System.out.println("El humano " + this.nombre + " puede volar en avion");
    }

    @Override
    public void changeDimension() {
        System.out.println("Cambio de dimension con maquinas");
    }
}
