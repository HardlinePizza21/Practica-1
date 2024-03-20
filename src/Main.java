import LivingBeingsPackage.LivingBeings;
import SkyBeings.Pajaro;
import SkyBeings.SkyBeing;

public class Main {


    public static void main(String[] args) {

        LivingBeingCreator Dios = new LivingBeingCreator();

        LivingBeings[] mundo = new LivingBeings[1];

        //1. Humano , 2. Pajaro, 3.tortuga
        Pajaro pajaro1 = Dios.crearSerPajaro();

        pajaro1.fly();

        for(int i = 0; i < mundo.length; i++){
            System.out.println(i + "." + mundo[i].getNombre() + "\n");
        }


    }
}