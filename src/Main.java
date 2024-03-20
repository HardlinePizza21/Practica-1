import BeingsOfTheEarth.Human;
import LivingBeingsPackage.LivingBeings;
import SkyBeings.Pajaro;
import SkyBeings.SkyBeing;

public class Main {

//    public void recorreMundo(LivingBeings[] mundo){
//        for(LivingBeings x : mundo){
//            if(x instanceof Human){
//                ((Human) x).fly();
//            }
//        }
//    }
    public static void main(String[] args) {



        LivingBeingCreator Dios = new LivingBeingCreator();

        LivingBeings[] mundo = new LivingBeings[1];

        //1.Humano, 2.Pajaro, 3. Tortuga
        Dios.crearSerVivo(3, mundo);

        mundo[0].fly();

    }
}