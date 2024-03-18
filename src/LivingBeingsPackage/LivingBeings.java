package LivingBeingsPackage;

public abstract class LivingBeings{
    protected int edad;
    protected String nombre;

    public LivingBeings(String nombre){
        this.nombre = nombre;
        this.born();
    }
    public LivingBeings(){

    }

    public String getNombre(){
        return this.nombre;
    }

    abstract public void fly();

    protected void born(){
        this.edad = 0;
        System.out.println("Nacio "+ this.nombre);
    }

    protected void grown(){
        this.edad++;

    }

    protected void reproduce(){
        System.out.println(this.nombre + " se esta reproduciendo");
    }

    public void die(){
        System.out.println(this.nombre + " murio");
    }
}