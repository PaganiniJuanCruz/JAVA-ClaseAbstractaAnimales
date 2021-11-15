public class Pajaro extends Animal{

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public String comunicarse() {
        return "El pájaro canta";
    }

    @Override
    public String trasladarse() {
        return "El pájaro vuela";
    }
    @Override
    public String toString() {
         return super.toString();
    }
}