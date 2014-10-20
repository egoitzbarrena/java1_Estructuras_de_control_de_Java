/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//definición de la clase Ejemplo1For
public class Ejemplo1For {
//define el método main
    public static void main(String[] args) {
//final: en este contexto indica que una variable es de tipo constante
//declara la variable VALOR_INICIAL de tipo integer con el valor 10.
        final int VALOR_INICIAL = 10; // limite inf. tabla
//declara la variable VALOR_FINAL de tipo integer con el valor 100.
        final int VALOR_FINAL = 100; // limite sup. tabla
//declara la variable PASO de tipo integer con el valor 10.
        final int PASO = 10 ; // incremento
//define la variable de tipo integer
        int fahrenheit;
//define la variable de tipo double
        double celsius;
//le pasa el valor de la variable VALOR_INICIAL a la variable fahrenheit.
        fahrenheit = VALOR_INICIAL;
//pinta en la pantalla un texto. en este aparece la siguiente linea. . 
        System.out.printf("Fahrenheit \t Celsius \n");
//valor inicial de la variable fahrenheit es el mismo que el del VALOR_INICIAL, durante el valor de fahrenheit sea menor o igual a la de la variable VALOR_INICIAL, le suma al valor de fahrenheit el valor de la variable PASO, escribe en la pantalla el valor de celcius y el valor de fahrenheit.
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
//le pasa  a la variable celcius el valor de la operacion matematica de la izquierda.
             celsius = 5*(fahrenheit - 32)/9.0;
//pinta en la pantalla en dos columnas el valor de la variable fahreheit y el valor de la variable celcius.
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
