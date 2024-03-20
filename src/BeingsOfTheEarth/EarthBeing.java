package BeingsOfTheEarth;
public interface EarthBeing {
    default void caminar(){
        System.out.println("Estoy caminando");
    };

    public void respaw();


}