package LivingBeingsPackage;
import BeingsOfTheEarth.*;
import SkyBeings.*;
public class LivingBeingCreator implements Creator {

    //Se crea un método que rrecorre el arreglo 'mundo' para añadir nuevos seres vivos
    public void Introducir_Arreglo(LivingBeings[] mundo, LivingBeings serVivo) {
        for (int i = 0; i < mundo.length; i++) {
            if (mundo[i] == null) {
                mundo[i] = serVivo;
                return;
            }
        }
        //Se imprime un mensaje si no hay espacio en el arreglo para añadir nuevos seres
        System.out.println("El mundo se encuentra sobrepoblado");
    }

    //Se implementa el método que controla la creación de las instancias
    @Override
    public void crearSerVivo(int tipo,String nombre ,LivingBeings[] mundo) {
        LivingBeings serVivo;
        switch (tipo) {
            case 1:
                serVivo = new Human(nombre);
                break;
            case 2:
                serVivo = new Pajaro(nombre);
                break;
            case 3:
                serVivo = new Tortuga(nombre);
                break;
            default:
                serVivo = null;
                break;
        }
        //Se introduce al arreglo la instancia
        Introducir_Arreglo(mundo, serVivo);
    }
}