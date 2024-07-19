import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void holamundo() {
        System.out.println("ira ama, mi primer programa");
        System.out.println("hola mundo");
    }

    public static void suma2n() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la suma de numeros");
        System.out.println("espero que te guste");
        System.out.print("Introduce el primer número: ");
        float n1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        float n2 = scanner.nextInt();

        float r = n1 + n2;

        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + r);

        scanner.close();
    }

    public static void parimpar(){

        System.out.println("Bienvenido a impar o par");
        System.out.println("veamos tu numero");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        scanner.close();
    }

    public static void factos(){

        System.out.println("Bienvenido a El factorial de un numero");
        System.out.println("veamos tu numero ");
        Scanner scanner = new Scanner(System.in); // Crear una instancia de Scanner

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt(); // Leer el número introducido por el usuario

        // Calcular el factorial del número
        long factorial = 1; // Usamos long para manejar números grandes
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close(); // Cerrar el Scanner al final
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    holamundo();
                    break;
                    case 6:
                        System.out.println("Adios mi loco te ira mejor en la prepa");
                        break;
                case 2:
                    suma2n();
                    break;
                case 3:
                    parimpar();
                    break;

                case 4:
                    factos();
                    break;

                case 5:


                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);

    }


    }
