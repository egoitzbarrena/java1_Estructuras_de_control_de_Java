/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
//importa todas las clases  del paquete java.util
import java.util.*;
//definición de la clase Ejemplo0Switch
public class Ejemplo0Switch {
//define el método main
    public static void main(String[] args) {
//define la variable de tipo integer.
        int mes;
//utiliza la clase scanner para recojer todo lo que el usuario meta por el teclado y lo guarda en la variable sc de tipo Scanner.
        Scanner sc = new Scanner(System.in);
//pinta en la pantalla un texto. en este caso te pide que introduzcas el numero del mes.  
        System.out.print("Introduzca un numero de mes: ");
//recoje lo que has introducido en la variable mes.
        mes = sc.nextInt();
//con este metodo dependiendo del numero introducido mostrara una linea o otra.
        switch (mes)
        {
//si introduces el numero 1 anteriormente aparecera la siguiente linea(Enero).
                case 1: System.out.println("ENERO");
//sirve para salir del switch
                           break;
//si introduces el numero 2 anteriormente aparecera la siguiente linea(Febrero).
                case 2: System.out.println("FEBRERO");
//sirve para salir del switch
                           break;
//si introduces el numero 3 anteriormente aparecera la siguiente linea(Marzo).
                case 3: System.out.println("MARZO");
//sirve para salir del switch
                           break;
//si introduces el numero 4 anteriormente aparecera la siguiente linea(Abril).
                case 4: System.out.println("ABRIL");
//sirve para salir del switch
                           break;
//si introduces el numero 5 anteriormente aparecera la siguiente linea(Mayo).
                case 5: System.out.println("MAYO");
//sirve para salir del switch
                           break;
//si introduces el numero 6 anteriormente aparecera la siguiente linea(Junio).
                case 6: System.out.println("JUNIO");
//sirve para salir del switch
                           break;
//si introduces el numero 7 anteriormente aparecera la siguiente linea(Julio).
                case 7: System.out.println("JULIO");
//sirve para salir del switch
                           break;
//si introduces el numero 8 anteriormente aparecera la siguiente linea(Agosto).
                case 8: System.out.println("AGOSTO");
//sirve para salir del switch
                           break;
//si introduces el numero 9 anteriormente aparecera la siguiente linea(Septiembre).
                case 9: System.out.println("SEPTIEMBRE");
//sirve para salir del switch
                           break;
//si introduces el numero 10 anteriormente aparecera la siguiente linea(Octubre).
                case 10: System.out.println("OCTUBRE");
//sirve para salir del switch
                             break;
//si introduces el numero 11 anteriormente aparecera la siguiente linea(Noviembre).
                case 11: System.out.println("NOVIEMBRE");
//sirve para salir del switch
                             break;
//si introduces el numero 12 anteriormente aparecera la siguiente linea(Diciembre).
                case 12: System.out.println("DICIEMBRE");
//sirve para salir del switch
                             break;
//si introduces no es ninguno de los anteriores aparecera la siguiente linea(Mes no valido).
                default : System.out.println("Mes no válido");                       
        }
    }
}
