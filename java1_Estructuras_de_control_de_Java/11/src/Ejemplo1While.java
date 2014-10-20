/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo1While
public class Ejemplo1While {
//define el método main
    public static void main(String[] args) {
//define las variables de tipo integer, y declara la variable suma dandole el valor 0.
        int suma = 0, num;
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner(System.in);
//pinta en la pantalla un texto. en este te pide que introduzcos un numero . 
        System.out.print("Introduzca un número: ");
//recoje lo que has introducido en la variable num.
        num = sc.nextInt();
//mientras el numero sea mayor o igual a 0 va a ejecutar las siguientes lineas.
        while (num >= 0){
//le pasa a la variable suma la suma entre la variable num y la variable suma.
               suma = suma + num;
//pinta en la pantalla un texto. en este te pide que introduzcos un numero . 
               System.out.print("Introduzca un número: ");
//recoje lo que has introducido en la variable num.
               num = sc.nextInt();
        }
//pinta en la pantalla un texto. en este caso aparece la frase la suma es y el valor de la variable suma. . 
        System.out.println("La suma es: " + suma );
    }
}
