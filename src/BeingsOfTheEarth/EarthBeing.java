package BeingsOfTheEarth;
public interface EarthBeing {
    default void caminar(){
        System.out.println("Estoy caminando");
    };

    public void born();

    public void grown();

    public void respaw();

    public void die();


}