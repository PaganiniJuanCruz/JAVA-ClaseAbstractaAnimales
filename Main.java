import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        Animal animal = null;


        //HAGO UN DO WHILE PARA INSTANCIAR EL SWITCH
        do {
            System.out.println("Ingrese el numero del animal \n1: Perro\n2: Gato\n3: Pájaro \n4: Salir");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        animal = new Perro("Perro");
                        break;
                    case 2:
                        animal = new Gato("Gato");
                        break;
                    case 3:
                        animal = new Pajaro("Pajaro");
                        break;
                    case 4:
                        System.out.println("Saliste del juego!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Error, ingrese un número válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, tenes que ingresar un número, no letras, programa finalizado!");
                salir = true;
            }

            if (animal != null && salir != true) {
                
                System.out.println("Elegiste el animal: " + animal.toString());
                System.out.println("--------------------");
                System.out.println(animal.comunicarse());
                System.out.println("--------------------");
                System.out.println(animal.trasladarse());
                System.out.println("--------------------");
            }
        } while (salir != true);
        sc.close();
    }
}
