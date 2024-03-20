import LivingBeingsPackage.LivingBeings;
import BeingsOfTheEarth.*;
import SkyBeings.*;
public class LivingBeingCreator implements Creator{


    @Override
    public LivingBeings crearSerVivo(int tipo) {
        switch (tipo){
            case 1:
                return new Human();
            case 2:
                return new Pajaro();
            case 3:
                return new Tortuga();
            default:
                return null;
        }
    }
}