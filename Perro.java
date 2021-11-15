public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public String comunicarse(){
        return "EL perro ladra!";
    }

    @Override
    public String trasladarse() {
        return "El perro corre en cuatro patas y juega";
    }

    @Override
    public String toString() {
         return super.toString();
    }
    
}