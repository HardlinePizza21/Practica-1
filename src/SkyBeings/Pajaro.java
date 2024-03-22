package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import LivingBeingsPackage.LivingBeings;

public class Pajaro extends LivingBeings implements SkyBeing, EarthBeing {
    public Pajaro(String nombre) {
        super(nombre);
    }

    //Se usa polimorfismo sobre los métodos abstractos que hereda de las interfaces y la superclase
    public void fly(){
        System.out.println(this.nombre +" está volando con sus alas");
    }

    @Override
    public void changeDimension() {
        System.out.println(this.nombre + " está cambiando de dimension");
    }


    @Override
    public void caminar() {
        System.out.println(this.nombre +" camina con patitas de pajaro");
    }

    @Override
    public void born() {
        System.out.println("Ha nacido un pájaro");
    }

    @Override
    public void grown() {
        super.edad++;
        System.out.println("El pájaro creció un año");
    }

    @Override
    public void die() {
        System.out.println(this.nombre +" ha muerto");
    }

    @Override
    public void respaw() {
        System.out.println(this.nombre +" ha reaparecido");
    }
}
