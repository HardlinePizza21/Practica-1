package BeingsOfTheEarth;
import LivingBeingsPackage.LivingBeings;
public class Tortuga extends LivingBeings implements EarthBeing {
    public Tortuga(String nombre) {
        super(nombre);
    }

    //Se usa polimorfismo sobre los métodos abstractos que hereda de la interfaz y la superclase
    @Override
    public void caminar() {
        System.out.println(this.nombre + " camina lento");
    }

    @Override
    public void born() {
        System.out.println("Ha nacido una tortuga");
    }

    @Override
    public void grown() {
        super.edad++;
        System.out.println(this.nombre + " creció un año");
    }

    @Override
    public void respaw() {
        System.out.println(this.nombre +" ha aparecido de nuevo");
    }

    @Override
    public void fly() {
        System.out.println("No puedo volar, soy una tortuga");
    }

    @Override
    public void changeDimension() {
        System.out.println("No puedo cambiar de dimensión, soy una tortuga");
    }

    @Override
    public void reproduce(){
        System.out.println(this.nombre +" se está reproduciendo");
    }

    @Override
    public void die(){
        System.out.println(this.nombre +" ha muerto");
    }
}
