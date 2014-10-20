 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo1OperadorCondicional
public class Ejemplo1OperadorCondicional {
//define el método main
    public static void main(String[] args) {
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner(System.in);
//define la variable de tipo integer
        int num;    
//pinta en la pantalla un texto. en este te pide que introduzcos un numero .  
        System.out.println("Introduzca numero: ");
//recoje lo que has introducido en la variable num.
        num = sc.nextInt();
//pinta en la pantalla un texto dependiendo del resultado de la condicion(si el resto de la division entre el numero introducido y el 2 es 0 se cumple la condicion). si la condicion se cumple aparece la palabra PAR. si no se cumple aparece la palabra IMPAR.
// ? value to assign if true : value to assign if false
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
