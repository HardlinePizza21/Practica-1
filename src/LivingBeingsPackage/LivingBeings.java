package LivingBeingsPackage;

import BeingsOfTheEarth.EarthBeing;
import SkyBeings.SkyBeing;

public abstract class LivingBeings implements EarthBeing, SkyBeing {
    protected int edad;
    protected String nombre;

    protected String raza;

    public LivingBeings(String nombre){
        this.nombre = nombre;
        this.born();
    }
    public LivingBeings(){

    }

    public String getNombre(){
        return this.nombre;
    }

    protected void born(){
        this.edad = 0;
        System.out.println("Nacio "+ this.nombre);
    }

    protected void grown(){
        this.edad++;

    }

    protected void reproduce(){
        System.out.println(this.nombre + " se esta reproduciendo");
    }

    public void die(){
        System.out.println(this.nombre + " murio");
    }


}