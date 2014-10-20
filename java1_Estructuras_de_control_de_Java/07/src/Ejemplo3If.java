/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo3If
public class Ejemplo3If {
//define el método main
    public static void main(String[] args) {
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
      Scanner sc = new Scanner(System.in);
//define la variable de tipo double.
      double nota;
//pinta en la pantalla un texto. en este caso te pide que introduzcas un nota entre el 0 y el 10.     
      System.out.println("Introduzca una nota entre 0 y 10: ");
//recoje lo que has introducido en la variable nota.
      nota = sc.nextDouble();
//pinta en la pantalla un texto. en este caso aparece la frase la calificacion del alumno es.
      System.out.println("La calificación del alumno es ");
//si la nota introducida anteriormente es menor a 0 o mayor a 10 aparece la siguiente linea.
      if(nota < 0 || nota > 10)
//pinta en la pantalla un texto. en este caso aparece la frase Nota no válida.
         System.out.println("Nota no válida");
//si no se cumple la condicion anterior, si la nota es igual a 10 aparece la siguiente linea(Matricula de honor).
      else if(nota==10)
//pinta en la pantalla un texto. en este caso aparece la frase Matricula de honor.
           System.out.println("Matrícula de Honor");
//si no se cumple la condicion anterior, si la nota es igual o mayor a 9 aparece la siguiente linea(Sobresaliente).
      else if (nota >= 9)
//pinta en la pantalla un texto. en este caso aparece la palabra sobresaliente.
           System.out.println("Sobresaliente");
//si no se cumple la condicion anterior, si la nota es igual o mayor a  7 aparece la siguiente linea(Notable).
      else if (nota >= 7)
//pinta en la pantalla un texto. en este caso aparece la palabra Notable.
           System.out.println("Notable");
//si no se cumple la condicion anterior, si la nota es igual o mayor a 6 aparece la siguiente linea(Bien).
      else if (nota >= 6)
//pinta en la pantalla un texto. en este caso aparece la palabra Bien.
           System.out.println("Bien");
//si no se cumple la condicion anterior, si la nota es igual o mayor a 6 aparece la siguiente linea(Bien).
      else if (nota >= 5)
//pinta en la pantalla un texto. en este caso aparece la palabra Suficiente.
           System.out.println("Suficiente");
//si no se cumple ninguna de las condiciones anteriores, si la nota aparece la siguiente linea(Suspenso).
      else
           System.out.println("Suspenso");
    }
}
