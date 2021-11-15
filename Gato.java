public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public String comunicarse(){
        return "El gato maulla";
    }

    @Override
    public String trasladarse() {
        return "El gato corre cuando esta asustado!";
    }
    
    @Override
    public String toString() {
         return super.toString();
    }
}