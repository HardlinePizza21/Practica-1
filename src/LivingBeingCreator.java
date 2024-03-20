import LivingBeingsPackage.LivingBeings;
import BeingsOfTheEarth.*;
import SkyBeings.*;
public class LivingBeingCreator implements Creator{


    @Override
    public void crearSerVivo(int tipo, LivingBeings[] arreglo) {
        LivingBeings serVivo;
        switch (tipo){
            case 1:
                serVivo = new Human("Negro");
                break;
            case 2:
                serVivo = new Pajaro();
                break;
            case 3:
                serVivo = new Tortuga();
                break;
            default: serVivo = null;
                break;
        }

        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == null) {
                arreglo[i] = serVivo;
            }
        }


    }
}