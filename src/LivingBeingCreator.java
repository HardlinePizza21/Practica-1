import LivingBeingsPackage.LivingBeings;
import BeingsOfTheEarth.*;
import SkyBeings.*;
public class LivingBeingCreator implements Creator{
    public void crearSerVivo(int tipo, LivingBeings[] seresVivos){
        LivingBeings serVivo;
        switch (tipo) {
            case 1:
                System.out.println("Se creo un humano");
                serVivo = new Human("Humano");
                break;
            case 2:
                System.out.println("Creando pajaro");
                serVivo = new SkyBeings();
                break;
            default:
                System.out.println("Opción no válida, entidad  misteriosa creado");
                serVivo = new UnknowEntity();
                break;
        }
        for(int i = 0; i < seresVivos.length; i++){
            if(seresVivos[i] == null){
                seresVivos[i] = serVivo;
            }
        }
    }
}