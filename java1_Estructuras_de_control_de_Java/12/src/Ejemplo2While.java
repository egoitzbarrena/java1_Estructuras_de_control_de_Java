/*
 * programa que lee un número n y muestra n asteriscos
 */
//importa todas las clases  del paquete java.util
import java.util.*;
///definición de la clase Ejemplo2While
public class Ejemplo2While {
//define el método main
    public static void main(String[] args) {
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner(System.in);
//define las variables de tipo integer, y declara la variable contador dandole el valor 0.
        int n, contador = 0;
//pinta en la pantalla un texto. en este te pide que introduzcos un numero .  
        System.out.print("Introduce un número: ");
//recoje lo que has introducido en la variable n.
        n = sc.nextInt();
//mientras que el valor de contador sea mas pequeño que el valor de la variable n se ejecutaran la siguientes lineas.
        while (contador < n){
//pinta en la pantalla un texto. en este pinta * . 
               System.out.println(" * ");
//Increment (++) decrement (--). incrementa el valor de contador +1.
               contador++;
        }
    }
}
