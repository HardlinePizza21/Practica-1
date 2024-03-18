package SkyBeings;
public interface SkyBeing{
    default void fly(){
        System.out.println("Vuelo con mis alas");
    }

    default void changeDimension(){
        System.out.println("Cambio de dimension");
    }
}