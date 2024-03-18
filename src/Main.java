import LivingBeingsPackage.LivingBeings;

public class Main {


    public static void main(String[] args) {

        LivingBeingCreator Dios = new LivingBeingCreator();

        LivingBeings[] mundo = new LivingBeings[1];
        //1. Humano , 2. Pajaro
        Dios.crearSerVivo(1, mundo);

        mundo[0].fly();

        for(int i = 0; i < mundo.length; i++){
            System.out.println(i + "." + mundo[i].getNombre() + "\n");
        }


    }
}