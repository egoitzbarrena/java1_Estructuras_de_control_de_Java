/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo1BuclesAnidados
public class Ejemplo1BuclesAnidados {
//define el método main
    public static void main(String[] args) {
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner(System.in);
//define las variables de tipo integer
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
//Primeramente se ejecuta la sentencia y luego evalúa la condición.       
 do{
//pinta en la pantalla un texto. 
           System.out.print("Introduce número de filas: ");
//recoje lo que has introducido en la variable filas.
           filas = sc.nextInt();
        }while(filas<1);
        //leer número de columnas hasta que sea un número > 0
        do{
//pinta en la pantalla un texto. 
           System.out.print("Introduce número de columnas: ");
//recoje lo que has introducido en la variable columnas.
           columnas = sc.nextInt();
mientras la variable columnas sea mayor a 1.
        }while(columnas<1);
//valor inicial de i 1, durante el valor de i sea menor o igual a la variable filas  incrementando 1.
        for(int i = 1; i<=filas; i++){    //filas
//valor inicial de j 1, durante el valor de i sea menor o igual a la variable columnas incrementando 1.
            for(int j = 1; j<=columnas; j++){   //columnas
// escribe * en la pantalla dependiendo el valor de i y j.
                 System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}
