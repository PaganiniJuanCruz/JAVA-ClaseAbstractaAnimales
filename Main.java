public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();
        Pez pez1 = new Pez();
        Pajaro pajaro1 = new Pajaro();

        System.out.println(perro1.comunicarse());
        System.out.println(gato1.comunicarse());
        System.out.println(vaca1.comunicarse());
        System.out.println(pez1.comunicarse());
        System.out.println(pajaro1.comunicarse());

        System.out.println("---------------");

        System.out.println(perro1.moverse());
        System.out.println(gato1.moverse());
        System.out.println(vaca1.moverse());
        System.out.println(pez1.moverse());
        System.out.println(pajaro1.moverse());
        
    }

}
