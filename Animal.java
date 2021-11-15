public abstract class Animal{
    String nombreAnimal;
    
    Animal(String nombre){
        this.nombreAnimal = nombre;
    }

    @Override
    public String toString() {
        return this.nombreAnimal;
    }
    
    public abstract String comunicarse();
    public abstract String trasladarse();
    
}