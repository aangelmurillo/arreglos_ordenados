import java.util.Scanner;

public class App {
    public static Character na;
    public static Scanner in = new Scanner(System.in);
    public static String op;

    public static void main(String[] args) throws Exception {
        limpiarConsola();
        mostrarMenu();
        System.out.print("Opcion: ");
        op = in.nextLine();
        limpiarConsola();
        Arreglo a = new Arreglo();

        do {
            switch (op) {
                case "1":
                    limpiarConsola();
                    a.inicializarArreglo();
                    volverMenu();
                    break;
                case "2":
                    limpiarConsola();
                    a.mostrarArreglo();
                    volverMenu();
                    break;
                case "3":
                    limpiarConsola();
                    System.out.print("Dame una letra que deseas buscar... ");
                    String c = in.nextLine();
                    a.buscarElemento(c);
                    volverMenu();
                    break;
                case "4":
                    limpiarConsola();
                    System.out.print("Dame una letra que deseas insertar... ");
                    char d = in.nextLine().charAt(0);
                    a.insertar(d);
                    volverMenu();
                    break;
                case "5":
                    limpiarConsola();
                    System.out.print("Dame una letra que deseas eliminar... ");
                    String e = in.nextLine();
                    a.eliminarElemento(e);
                    volverMenu();
                    break;
                case "6":
                    limpiarConsola();
                    System.out.print("Dame una letra que deseas modificar... ");
                    String v = in.nextLine();
                    System.out.print("Dame una letra que deseas agregar... ");
                    String n = in.nextLine();
                    a.modificarElemento(v, n);
                    volverMenu();
                    break;
                case "7":
                    limpiarConsola();
                    credits();
                    volverMenu();
                    break;
                case "8":
                    op = "8";
                    limpiarConsola();
                    break;
            }
        } while (op != "8");

        in.close();
    }

    public static void mostrarMenu() {
        System.out.println("==== Selecciona la opción que quieres elegir ====");
        System.out.println("\t 1. Inicializar / borrar arreglo");
        System.out.println("\t 2. Mostrar arreglo");
        System.out.println("\t 3. Buscar");
        System.out.println("\t 4. Insertar");
        System.out.println("\t 5. Eliminar");
        System.out.println("\t 6. Modificar");
        System.out.println("\t 7. Creditos");
        System.out.println("\t 8. Salir");
        System.out.println("=============================================≈====");
    }

    public static void credits() {
        System.out.println(
                "Los autores, son: \n\tJose Angel Murillo Verastegui 23170010 \n\t Adrian Alberto Gottfried Gutierrez 23170015 \n\t Angel Roberto Ibañez Chavez 21170138");
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void volverMenu() {
        System.out.print("Presiona Enter para ir al menú... ");
        while (true) {
            String input = in.nextLine();
            if (input.isEmpty()) { // Verifica si la entrada está vacía (es decir, si se presionó Enter)
                mostrarMenu();
                System.out.print("Opción: ");
                op = in.nextLine();
                limpiarConsola();
                // Aquí podrías agregar lógica para manejar la opción seleccionada
                break; // Sale del bucle mientras
            } else {
                System.out.print("Debes presionar Enter para ir al menú.");
            }
        }
    }

}
