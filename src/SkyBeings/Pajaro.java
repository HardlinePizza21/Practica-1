package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import LivingBeingsPackage.LivingBeings;

public class Pajaro extends LivingBeings implements SkyBeing, EarthBeing {
    public void fly(){
        System.out.println("Estoy volando con mis alas");
    }

    @Override
    public void changeDimension() {
        System.out.println("Estoy cambiando de dimension");
    }


    @Override
    public void caminar() {
        EarthBeing.super.caminar();
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
}
