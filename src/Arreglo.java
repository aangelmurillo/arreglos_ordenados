import java.util.Scanner;
import java.util.regex.Pattern;

public class Arreglo {
    static Scanner in = new Scanner(System.in);
    int max = 20;
    Character[] abecedario = new Character[max];
    int n = -1;

    public void insertar(char letra) {
        if (n == abecedario.length - 1) { 
            System.out.println("¡Arreglo lleno! No se puede insertar la letra " + letra + ".");
            return;
        }

        int posicion = 0;
        n++;

        while (posicion < n && (Character.toLowerCase(letra) >= Character.toLowerCase(abecedario[posicion]))) { 
            if (Character.toLowerCase(letra) == Character.toLowerCase(abecedario[posicion])) {
                if (Character.isUpperCase(letra) && !Character.isUpperCase(abecedario[posicion])) {
                    break;
                }
            }
            posicion++;
        }

        for (int i = n; i > posicion; i--) { 
            abecedario[i] = abecedario[i - 1];
        }

        abecedario[posicion] = letra;

        System.out.println("¡Letra \"" + letra + "\" guardada exitosamente en la posición " + posicion + "!");
    }
    

    public void inicializarArreglo() {
        System.out.println("Arreglo inicializado");
        n = -1;
    }

    public void mostrarArreglo() {
        if (n < 0) {
            System.out.println("Arreglo vacío");
        } else {
            for (int i = 0; i <= n; i++) {
                System.out.print(abecedario[i] + " ");
            }
            System.out.println();
        }
    }

    public int buscarElemento(String bus) {
        int posicionEncontrada = -1;
    
        if (n < 0) {
            System.out.println("El arreglo esta vacio");
            return posicionEncontrada;
        }
    
        for (int i = 0; i <= n; i++) {
            if (bus.equals(abecedario[i].toString())) {
                System.out.println("La encontre en la localidad " + i + " y es: " + abecedario[i]);
                posicionEncontrada = i;
                break;
            }  if (i == n) {
                System.out.println("No encontre la letra " + bus + " en el arreglo");
                return posicionEncontrada;
            }
        }
    
        return posicionEncontrada;
    }

    public boolean eliminarElemento(String b) {
        int posicion = buscarElemento(b);

        if (posicion >= 0) {
            for (int i = posicion; i < n; i++) {
                abecedario[i] = abecedario[i + 1];
            }
            n--;
            System.out.println("Caracter eliminado de la localidad " + posicion);
            return true;
        } else {
            System.out.println("Caracter no encontrado");
            return false;
        }
    }

    public void modificarElemento(String letraModificar, String nuevo) {
        if (eliminarElemento(letraModificar)) {
            insertar(nuevo.charAt(0));
        }
    }
}
