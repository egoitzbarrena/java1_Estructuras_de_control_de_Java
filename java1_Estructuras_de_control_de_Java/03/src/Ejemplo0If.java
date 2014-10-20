/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo0If
public class Ejemplo0If {
//define el método main
    public static void main( String[] args ){
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner( System.in );
//pinta en la pantalla un texto. en este caso te pide que introduzcas la nota .
        System.out.print("Nota: ");
//recoje lo que has introducido en la variable nota.
        int nota = sc.nextInt();
// si la nota es mayor o igual a 5 , se ejecutan los siguientes dos lineas. 
        if (nota >= 5 ){
//pinta en la pantalla un texto. en este caso la palabra enorabuena .
            System.out.println("Enorabuena!!");
//pinta en la pantalla un texto. en este caso la frase has aprobado.
            System.out.println("Has aprobado");
        }
    }
}
