import java.util.Scanner;

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
        float n1 = scanner.nextFloat();
        System.out.print("Introduce el segundo número: ");
        float n2 = scanner.nextFloat();

        float r = n1 + n2;

        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + r);
    }

    public static void parimpar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a impar o par");
        System.out.println("veamos tu numero");

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    public static void factos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a El factorial de un numero");
        System.out.println("veamos tu numero ");

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static void multi(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Multiplicacion de un numero");
        System.out.println("veamos tu numero ");

        System.out.print("Introduce el número para generar la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce hasta qué número deseas multiplicar: ");
        int limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
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
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    holamundo();
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
                    multi();
                    break;
                case 6:
                    System.out.println("Adios mi loco te ira mejor en la prepa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
