package LivingBeingsPackage;
import BeingsOfTheEarth.*;
import SkyBeings.*;
public class Main {
    //Posible solución al problema de herencia

    /*public void mundo(LivingBeings mundo[]){
      for(LivingBeings ser: mundo){
          if(ser instanceof Human){
              ((Human)ser).caminar();
              ((Human)ser).fly();
              ((Human)ser).changeDimension();
              ((Human)ser).die();
          } else if (ser instanceof Tortuga) {
              ((Tortuga)ser).caminar();
              ((Tortuga)ser).fly();
              ((Tortuga)ser).reproduce();
          }else if (ser instanceof Pajaro){
              ((Pajaro)ser).caminar();
              ((Pajaro)ser).fly();
              ((Pajaro)ser).changeDimension();
              ((Pajaro)ser).die();
          }
      }
    }
    */
    public static void Llamar_Metodos(LivingBeings[] Mundo){
        for(LivingBeings Ser: Mundo){
            Ser.caminar();
            Ser.grown();
            Ser.reproduce();
            Ser.respaw();
            if(Ser instanceof Human || Ser instanceof Pajaro){
                Ser.fly();
                Ser.changeDimension();
            }
            Ser.die();
        }
    }

    public static void main(String[] args) {
        //Creamos una instancia de la clase 'Fabrica'
        LivingBeingCreator Dios = new LivingBeingCreator();

        //Se crea un arreglo con instancias de la clase general
        LivingBeings[] Mundo = new LivingBeings[3];

        //Se definen las instancias de las clases hijas
        Dios.crearSerVivo(1, "Eva", Mundo);    //1.Humano, 2.Pajaro, 3. Tortuga
        Dios.crearSerVivo(2,"Guacamaya",Mundo);
        Dios.crearSerVivo(3,"Galápago",Mundo);
        Dios.crearSerVivo(8, "011901",Mundo);

        //Se llaman los métodos de los objetos en el arreglo
        Llamar_Metodos(Mundo);
    }
}