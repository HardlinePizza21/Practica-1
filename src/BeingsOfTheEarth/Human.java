package BeingsOfTheEarth;
import SkyBeings.SkyBeing;
import LivingBeingsPackage.LivingBeings;
public class Human extends LivingBeings implements EarthBeing, SkyBeing{
    public Human(String nombre) {
        super(nombre);
    }

    //Se usa polimorfismo sobre los métodos abstractos que hereda de las interfaces y la superclase
    @Override
    public void fly() {
        System.out.println(this.nombre + " puede volar creando sus propias alas");
    }

    @Override
    public void changeDimension() {
        System.out.println(this.nombre +" de dimension con maquinas");
    }

    @Override
    public void born() {
        System.out.println("Nacio un humano");
    }

    @Override
    public void grown() {
        this.edad++;
        System.out.println(this.nombre +" creció un año");
    }

    @Override
    public void respaw() {
        System.out.println(this.nombre +" volvió a la vida como un zombie");
    }

    @Override
    public void die(){
        double posibilidad = Math.random();
        if(posibilidad > 0){
            System.out.println(this.nombre +" se ha salvado de la muerte gracias a la medicina");
        }
        else{
            System.out.println("No hay nada que la medicina pueda hacer, " + this.nombre + " ha muerto");
        }
    }
}
